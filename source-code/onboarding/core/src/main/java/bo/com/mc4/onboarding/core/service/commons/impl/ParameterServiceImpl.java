package bo.com.mc4.onboarding.core.service.commons.impl;

import bo.com.mc4.onboarding.core.service.commons.ParameterService;
import bo.com.mc4.onboarding.core.util.Crypt;
import bo.com.mc4.onboarding.core.util.FormatUtil;
import bo.com.mc4.onboarding.core.util.ValidationUtil;
import bo.com.mc4.onboarding.core.util.exception.OperationException;
import bo.com.mc4.onboarding.core.util.exception.ParameterNotFoundException;
import bo.com.mc4.onboarding.model.auth.dto.ParameterDto;
import bo.com.mc4.onboarding.model.commons.Parameter;
import bo.com.mc4.onboarding.model.commons.ParameterGroup;
import bo.com.mc4.onboarding.model.util.StringUtil;
import bo.com.mc4.onboarding.repository.commons.ParameterGroupRepository;
import bo.com.mc4.onboarding.repository.commons.ParameterRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service("parameterService")
public class ParameterServiceImpl implements ParameterService {

    @Autowired
    private ParameterRepository muParameterRepository;

    @Autowired
    private ParameterGroupRepository muParameterGroupRepository;

    @Override
    public String getValue(String codigo) {
        Optional<Parameter> optional = this.muParameterRepository.findParametroByCodigo(codigo);
        return optional.map(muParametro -> (String) getValue(muParametro)).orElse("");
    }

    @Override
    public boolean getBoolean(String codigo) {
        Optional<Parameter> optional = this.muParameterRepository.findParametroByCodigo(codigo);
        return optional.map(muParametro -> (Boolean) getValue(muParametro)).orElse(false);
    }

    @Override
    public BigDecimal getNumber(String codigo) {
        Optional<Parameter> optional = this.muParameterRepository.findParametroByCodigo(codigo);
        return optional.map(muParametro -> ((BigDecimal) getValue(muParametro))).orElse(new BigDecimal(0));
    }

    @Override
    public Date getDate(String codigo) {
        Optional<Parameter> optional = this.muParameterRepository.findParametroByCodigo(codigo);
        return optional.map(muParametro -> ((Date) getValue(muParametro))).orElse(new Date());
    }

    @Override
    public int getInt(String codigo) {
        Optional<Parameter> optional = this.muParameterRepository.findParametroByCodigo(codigo);
        return optional.map(muParametro -> ((BigDecimal) getValue(muParametro)).intValue()).orElse(0);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void saveParameter(Parameter muParameter) {
        if (!this.muParameterRepository.findParametroByCodigo(muParameter.getCode()).isPresent()) {
            this.muParameterRepository.save(muParameter);
        }
    }

    // TODO (por fmontero) verificar la parte default , estaba comentada y SONAR indica que se debe implementar una parte default
    private Object getValue(Parameter muParameter) {
        switch (muParameter.getParameterType()) {
            case CADENA:
                if (muParameter.isEncode()) {
                    return Crypt.getInstance().decrypt(muParameter.getStringValue());
                } else {
                    return muParameter.getStringValue();
                }
            case FECHA:
                return muParameter.getDateValue();
            case BOOLEANO:
                return muParameter.getBoolValue();
            case NUMERICO:
                return muParameter.getNumberValue();
            case LOB:
                return muParameter.getLobValue();
            default:
                throw new ParameterNotFoundException("No se econtro el parametro: " + muParameter.getCode());
        }
    }

    @Override
    public List<ParameterDto> list(Long grupoId) {
        ParameterGroup muParameterGroup = this.muParameterGroupRepository.findById(grupoId).orElseThrow(() -> new OperationException(FormatUtil.noRegistrado("Grupo de Parámetro", grupoId)));
        return muParameterRepository.obtenerParametros(muParameterGroup.getId());
    }

    @Override
    public List<ParameterDto> list(String grupoId) {
        ParameterGroup muParameterGroup = this.muParameterGroupRepository.findByGrupo(grupoId).orElseThrow(() -> new OperationException(FormatUtil.noRegistrado("Grupo de Parámetro", grupoId)));
        return muParameterRepository.obtenerParametros(muParameterGroup.getId());
    }

    @Override
    public Page<Parameter> listParametersByGroup(Long group, String filter, Pageable pageable) {
        if (StringUtil.isEmptyOrNull(filter)) filter = "%%";
        else filter = "%" + filter + "%";
        ParameterGroup muParameterGroup = this.muParameterGroupRepository.findById(group).orElseThrow(() -> new OperationException(FormatUtil.noRegistrado("Grupo de Parámetro", group)));
        return this.muParameterRepository.getParametersPageWithFilter(muParameterGroup, filter, pageable);
    }

    @Override
    public List<Parameter> searchList(String criterioBusqueda) {
        if (StringUtil.isEmptyOrNull(criterioBusqueda)) {
            criterioBusqueda = "";
        }
        criterioBusqueda = "%" + criterioBusqueda + "%";
        return muParameterRepository.searchAll(criterioBusqueda);
    }

    @Override
    @Transactional
    public Parameter createParameter(ParameterDto parametroDto) {

        ValidationUtil.throwExceptionRequiredIfBlank("Codigo", parametroDto.getCode());
        if (this.muParameterRepository.findParametroByCodigo(parametroDto.getCode()).isPresent())
            throw new OperationException(FormatUtil.yaRegistrado("Parametro", "Codigo", parametroDto.getCode()));
        ValidationUtil.throwExceptionRequiredIfBlank("Descripcion", parametroDto.getDescription());
        switch (parametroDto.getParameterType()) {
            case FECHA:
                ValidationUtil.throwExceptionIfInvalidDate("Valor de Fecha", parametroDto.getDateValue(), true);
                break;
            case CADENA:
                ValidationUtil.throwExceptionIfInvalidText("Valor de Cadena", parametroDto.getStringValue(), true, 1, 1024);
                break;
            case BOOLEANO:
                if (parametroDto.getBoolValue() == null)
                    throw new OperationException(FormatUtil.requerido("Valor Booleano"));
                break;
            case NUMERICO:
                if (parametroDto.getNumberValue() == null)
                    throw new OperationException(FormatUtil.requerido("Valor Numerico"));
                break;
            case LOB:
                ValidationUtil.throwExceptionRequiredIfBlank("Valor de Cadena Lob", parametroDto.getLobValue());
                break;
            default:
                log.warn("Tipo de parametro no reconocido para actualizar, Código: {}, Tipo: {}", parametroDto.getCode(), parametroDto.getParameterType());
                throw new OperationException(String.format("No se reconoce el tipo de dato del parametro código:%s , Tipo: %s", parametroDto.getCode(), parametroDto.getParameterType()));
        }
        ParameterGroup parameterGroup = muParameterGroupRepository.findById(parametroDto.getIdParameterGroup().getId()).orElseThrow(() ->
                new OperationException(FormatUtil.noRegistrado("Grupo Parámetro", parametroDto.getIdParameterGroup().getId())));

        return this.muParameterRepository.save(Parameter.builder().code(parametroDto.getCode()).dateValue(parametroDto.getDateValue()).stringValue(parametroDto.getStringValue()).boolValue(parametroDto.getBoolValue()).numberValue(parametroDto.getNumberValue()).lobValue(parametroDto.getLobValue()).description(parametroDto.getDescription()).idParameterGroup(parameterGroup).build());
    }

    @Override
    public Parameter updateParameter(Long parametroId, ParameterDto parametroDto) {
        ValidationUtil.throwExceptionIfInvalidNumber("Parametro Id", parametroId, true, 0L);
        Parameter muParameter = this.muParameterRepository.findById(parametroId).orElseThrow(() ->
                new OperationException(FormatUtil.noRegistrado("Parámetro", parametroId)));
//        ValidationUtil.throwExceptionRequiredIfBlank("Codigo", parametroDto.getCode());
        ValidationUtil.throwExceptionRequiredIfNull("Datos Sensible", parametroDto.getEncode());
        ValidationUtil.throwExceptionRequiredIfBlank("Descripcion", parametroDto.getDescription());
        muParameter.setDescription(parametroDto.getDescription());
        muParameter.setEncode(parametroDto.getEncode());
        switch (muParameter.getParameterType()) {
            case FECHA:
                ValidationUtil.throwExceptionIfInvalidDate("Valor de Fecha", parametroDto.getDateValue(), true);
                muParameter.setDateValue(parametroDto.getDateValue());
                break;
            case CADENA:
                ValidationUtil.throwExceptionIfInvalidText("Valor de Cadena", parametroDto.getStringValue(), true, 1, 1024);
                muParameter.setStringValue(parametroDto.getStringValue());
                break;
            case BOOLEANO:
                if (parametroDto.getBoolValue() == null)
                    throw new OperationException(FormatUtil.requerido("Valor Booleano"));
                muParameter.setBoolValue(parametroDto.getBoolValue());
                break;
            case NUMERICO:
                if (parametroDto.getNumberValue() == null)
                    throw new OperationException(FormatUtil.requerido("Valor Numerico"));
                muParameter.setNumberValue(parametroDto.getNumberValue());
                break;
            case LOB:
                ValidationUtil.throwExceptionRequiredIfBlank("Valor de Cadena Lob", parametroDto.getLobValue());
                muParameter.setLobValue(parametroDto.getLobValue());
                break;
            default:
                log.warn("Tipo de parametro no reconocido para actualizar, Código: {}, Tipo: {}", parametroDto.getCode(), parametroDto.getParameterType());
                throw new OperationException(String.format("No se reconoce el tipo de dato del parametro código:%s , Tipo: %s", parametroDto.getCode(), parametroDto.getParameterType()));
        }
        return this.muParameterRepository.save(muParameter);
    }

    @Override
    public ParameterDto getParameter(String codigo) {
        Parameter muParameter = this.muParameterRepository.getByCodigo(codigo);
        if (muParameter == null) {
            throw new OperationException(FormatUtil.noRegistrado("Parámetro", codigo));
        }
        ParameterDto dto = new ParameterDto(muParameter);
        return dto;
    }

    @Override
    public Long update(Parameter muParameter, Long id) {
        Parameter muParameterRegistrado = muParameterRepository.getOne(id);
        if (muParameterRegistrado == null) {
            throw new OperationException("No se encontró el párametro");
        }
        if (StringUtil.isEmptyOrNull(muParameter.getDescription())) {
            throw new OperationException(FormatUtil.requerido("descripción"));
        }
        muParameterRegistrado.setDescription(muParameter.getDescription());
        muParameterRepository.save(muParameterRegistrado);
        return muParameterRegistrado.getId();
    }


    @Override
    public Parameter getParam(String codigo) {
        return this.muParameterRepository.findParametroByCodigo(codigo).orElseThrow(() -> new OperationException("No se encontró ningún parámetro con el código [" + codigo + "] "));
    }

    @Override
    @javax.transaction.Transactional
    public void delete(Long idParametro) {
        Parameter parameter = this.muParameterRepository.findById(idParametro).orElseThrow(() -> new OperationException("No existe un parámetro con id: " + idParametro));
        parameter.setDeleted(true);
        this.muParameterRepository.save(parameter);
    }

}
