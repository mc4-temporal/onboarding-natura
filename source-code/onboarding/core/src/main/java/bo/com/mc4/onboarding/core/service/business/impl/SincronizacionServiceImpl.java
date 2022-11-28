package bo.com.mc4.onboarding.core.service.business.impl;

import bo.com.mc4.onboarding.core.service.business.SincronizacionService;
import bo.com.mc4.onboarding.integrations.gera.GeraClient;
import bo.com.mc4.onboarding.integrations.gera.IGeraClient;
import bo.com.mc4.onboarding.integrations.gera.dto.GeraResponse;
import bo.com.mc4.onboarding.integrations.gera.dto.directoras.response.ConsultaDirectorasResponseDto;
import bo.com.mc4.onboarding.integrations.gera.dto.directoras.response.Email;
import bo.com.mc4.onboarding.integrations.gera.dto.directoras.response.ResponsibleUser;
import bo.com.mc4.onboarding.integrations.gera.dto.directoras.response.Telephone;
import bo.com.mc4.onboarding.integrations.gera.dto.input.ConsultaDirectorasQpDTO;
import bo.com.mc4.onboarding.integrations.gera.dto.output.ResponseAuthApiGeraDto;
import bo.com.mc4.onboarding.model.business.Directora;
import bo.com.mc4.onboarding.model.business.Region;
import bo.com.mc4.onboarding.repository.business.DirectoraRepository;
import bo.com.mc4.onboarding.repository.business.RegionRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Service("sincronizacionServiceImpl")
public class SincronizacionServiceImpl implements SincronizacionService {
    private final IGeraClient iGeraClient;
    private final DirectoraRepository directoraRepository;
    private final RegionRepository regionRepository;

    @Override
    public void sincronizarDirectorasGera() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("client_id","EscritorioVirtual");
        params.put("client_secret","9244B35CFF3243E5A29C5ADDD7A514E63D3F3D42");
        params.put("grant_type","password");
        params.put("username","136241");
        params.put("password","Cn2022");
        params.put("url", "https://hmlapiauthnaturabo.geravd.com.br/api");
        try {
            ResponseAuthApiGeraDto responseAuthApiGeraDto = iGeraClient.retrieveAuthToken(params);

            GeraClient.Service dataConnection = new GeraClient.Service();
            dataConnection.setUrl("https://hmlapinaturabo.geravd.com.br/api");
            dataConnection.setToken(responseAuthApiGeraDto.access_token);
            dataConnection.setConnectTimeout(20000);
            dataConnection.setReadTimeout(20000);

            ConsultaDirectorasQpDTO dto = new ConsultaDirectorasQpDTO();
            dto.setLevelCode(3);

            List<Region> regions = regionRepository.findAll();

            GeraResponse<List<ConsultaDirectorasResponseDto>> consultaDirectoras = iGeraClient.requestConsultaDirectoras(dto, "", 1, 1, dataConnection);
            boolean plusOne = consultaDirectoras.getTotal() % 100 > 0;
            int totalPages = consultaDirectoras.getTotal() / 100;
            if (plusOne) totalPages ++;
            for (int i = 1; i <= totalPages; i++) {
                consultaDirectoras = iGeraClient.requestConsultaDirectoras(dto, "", i, 100, dataConnection);
                List<ResponsibleUser> directoraList = consultaDirectoras.getData().stream().map(ConsultaDirectorasResponseDto::getResponsibleUser)
                        .filter(Objects::nonNull)
                        .collect(Collectors.toList());
                log.info("Directoras para insertar: {}", directoraList.size());
                for (ResponsibleUser directoraGera : directoraList) {
                    if (!directoraRepository.existsByCodigoDirectora(directoraGera.getCode().toString())) {
                        List<Telephone> telephones = directoraGera.getTelephones();
                        List<Email> emails = directoraGera.getEmails();
                        String telf = null;
                        if (telephones != null && !telephones.isEmpty()) {
                            telf = telephones.get(0).getTelephone();
                        }
                        String correo = null;
                        if (emails != null && !emails.isEmpty()) {
                            correo = emails.get(0).getEmail();
                        }
                        directoraRepository.save(Directora.builder()
                                .idRegion(regions.get(0))
                                .codigoDirectora(directoraGera.getCode().toString())
                                .nombre(directoraGera.getName())
                                .telefono(telf)
                                .tokenInvitacion(directoraGera.getCode().toString())
                                .correo(correo)
                                .build());
                    }
                }
            }

        } catch (Exception e) {
            log.error("Error al sincronizar directoras", e);
        }
    }
}
