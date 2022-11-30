package bo.com.mc4.onboarding.core.service.business.impl;

import bo.com.mc4.onboarding.core.service.business.SincronizacionService;
import bo.com.mc4.onboarding.core.util.exception.ExceptionUtil;
import bo.com.mc4.onboarding.integrations.gera.GeraClient;
import bo.com.mc4.onboarding.integrations.gera.IGeraClient;
import bo.com.mc4.onboarding.integrations.gera.dto.GeraResponse;
import bo.com.mc4.onboarding.integrations.gera.dto.directoras.response.ConsultaDirectorasResponseDto;
import bo.com.mc4.onboarding.integrations.gera.dto.directoras.response.Email;
import bo.com.mc4.onboarding.integrations.gera.dto.directoras.response.ResponsibleUser;
import bo.com.mc4.onboarding.integrations.gera.dto.directoras.response.Telephone;
import bo.com.mc4.onboarding.integrations.gera.dto.input.ConsultaDirectorasQpDTO;
import bo.com.mc4.onboarding.model.auth.enums.TipoGerente;
import bo.com.mc4.onboarding.model.business.Directora;
import bo.com.mc4.onboarding.model.business.Gerencia;
import bo.com.mc4.onboarding.model.business.Gerente;
import bo.com.mc4.onboarding.model.business.Servicio;
import bo.com.mc4.onboarding.model.business.enums.TipoServicio;
import bo.com.mc4.onboarding.repository.ServicioRepository;
import bo.com.mc4.onboarding.repository.business.DirectoraRepository;
import bo.com.mc4.onboarding.repository.business.GerenciaRepository;
import bo.com.mc4.onboarding.repository.business.GerenteRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service("sincronizacionServiceImpl")
public class SincronizacionServiceImpl implements SincronizacionService {
    private final IGeraClient iGeraClient;
    private final DirectoraRepository directoraRepository;
    private final ServicioRepository servicioRepository;
    private final GerenciaRepository gerenciaRepository;
    private final GerenteRepository gerenteRepository;

    @Override
    public void sincronizarDirectorasGera(String accessToken) {
        try {
            Servicio servicioGera = servicioRepository.findByTipo(TipoServicio.GERA)
                    .orElseThrow(ExceptionUtil.throwFindFail(TipoServicio.GERA.getTipo(), "Servicio"));

            GeraClient.Service dataConnection = new GeraClient.Service();
            dataConnection.setUrl(servicioGera.getUrl());
            dataConnection.setToken(accessToken);
            dataConnection.setConnectTimeout(servicioGera.getConnectionTimeout());
            dataConnection.setReadTimeout(servicioGera.getRequestTimeout());

            ConsultaDirectorasQpDTO dto = new ConsultaDirectorasQpDTO();
            dto.setLevelCode(3);

            GeraResponse<List<ConsultaDirectorasResponseDto>> consultaDirectoras = iGeraClient.requestConsultaDirectoras(dto, "", 1, 1, dataConnection);
            boolean plusOne = consultaDirectoras.getTotal() % 100 > 0;
            int totalPages = consultaDirectoras.getTotal() / 100;
            if (plusOne) totalPages ++;
            for (int i = 1; i <= totalPages; i++) {
                consultaDirectoras = iGeraClient.requestConsultaDirectoras(dto, "", i, 100, dataConnection);
                log.info("Directoras para insertar: {}", consultaDirectoras.getData().size());
                for (ConsultaDirectorasResponseDto item : consultaDirectoras.getData()) {
                    if (item.getResponsibleUser() == null) continue;
                    ResponsibleUser directoraGera = item.getResponsibleUser();

                    Gerencia gerencia = gerenciaRepository.findByCodigoGera(item.getCode().toString()).orElse(null);

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
                    Directora directora = directoraRepository.findByCodigoGera(directoraGera.getCode().toString())
                            .orElse(Directora.builder()
                                    .codigoDirectora(directoraGera.getCode().toString())
                                    .nombre(directoraGera.getName())
                                    .telefono(telf)
                                    .tokenInvitacion(directoraGera.getCode().toString())
                                    .correo(correo)
                                    .idGerencia(gerencia)
                                    .build());
                    directora.setIdGerencia(gerencia);
                    directoraRepository.save(directora);
                }
            }

        } catch (Exception e) {
            log.error("Error al sincronizar directoras", e);
        }
    }

    @Override
    public void sincronizacionGerencias(String accessToken) {
        try {

            Servicio servicioGera = servicioRepository.findByTipo(TipoServicio.GERA)
                    .orElseThrow(ExceptionUtil.throwFindFail(TipoServicio.GERA.getTipo(), "Servicio"));

            GeraClient.Service dataConnection = new GeraClient.Service();
            dataConnection.setUrl(servicioGera.getUrl());
            dataConnection.setToken(accessToken);
            dataConnection.setConnectTimeout(servicioGera.getConnectionTimeout());
            dataConnection.setReadTimeout(servicioGera.getRequestTimeout());

            ConsultaDirectorasQpDTO dto = new ConsultaDirectorasQpDTO();
            dto.setLevelCode(2);

            GeraResponse<List<ConsultaDirectorasResponseDto>> gerenciasResponse = iGeraClient.requestConsultaDirectoras(dto, "", 1, 1, dataConnection);
            boolean plusOne = gerenciasResponse.getTotal() % 100 > 0;
            int totalPages = gerenciasResponse.getTotal() / 100;
            if (plusOne) totalPages++;
            for (int i = 1; i <= totalPages; i++) {
                gerenciasResponse = iGeraClient.requestConsultaDirectoras(dto, "", i, 100, dataConnection);
                log.info("Sincronizando {} gerencias", gerenciasResponse.getData().size());
                for (ConsultaDirectorasResponseDto item : gerenciasResponse.getData()) {
                    if (item.getResponsibleUser() == null) continue;
                    Gerencia gerencia = gerenciaRepository.findByCodigoGera(item.getCode().toString())
                            .orElse(Gerencia.builder()
                                    .codigoGera(item.getCode().toString())
                                    .nombre(item.getName())
                                    .oficina(item.getParent().getName())
                                    .build());
                    if (gerencia.getId() == null) {
                        gerenciaRepository.save(gerencia);
                    }
                    Gerente gerente = gerenteRepository.findByCodigoGera(item.getResponsibleUser().getCode().toString())
                            .orElse(Gerente.builder()
                                    .codigoGera(item.getResponsibleUser().getCode().toString())
                                    .nombre(item.getResponsibleUser().getName())
                                    .tipo(TipoGerente.A)
                                    .build());
                    gerente.setGerencia(gerencia);
                    gerenteRepository.save(gerente);
                }
            }
        } catch (Exception e) {
            log.error("Error al sincronizar gerencias", e);
        }
    }
}
