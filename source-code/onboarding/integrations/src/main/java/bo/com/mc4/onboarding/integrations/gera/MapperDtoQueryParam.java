package bo.com.mc4.onboarding.integrations.gera;

import bo.com.mc4.onboarding.integrations.gera.dto.input.ConsultaConsultorasQpDTO;
import bo.com.mc4.onboarding.integrations.gera.dto.input.ConsultaDirectorasQpDTO;
import bo.com.mc4.onboarding.integrations.util.QueryParamUtil;

/**
 * mapperDtoQueryParam
 *
 * @author Marcos Quispe
 * @since 1.0
 */
public class MapperDtoQueryParam {

    public static String convertDtoToQueryParams(ConsultaDirectorasQpDTO dto, String sortOptions, Integer page, Integer pageSize) {
        String result = "";
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("code", dto.getCode()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("name", dto.getName()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("parentCode", dto.getParentCode()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("responsibleUserCode", dto.getResponsibleUserCode()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("coresponsibleUserCode", dto.getCoresponsibleUserCode()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("responsibleOrcoresponsibleUserCode", dto.getResponsibleOrcoresponsibleUserCode()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("levelCode", dto.getLevelCode()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("cycle", dto.getCycle()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("isActive", dto.getIsActive()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("includeOptions", dto.getIncludeOptions()));

        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("sortOptions", sortOptions));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("page", page));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("pageSize", pageSize));
        return result;
    }

    public static String convertDtoToQueryParams(ConsultaConsultorasQpDTO dto, String sortOptions, Integer page, Integer pageSize) {
        String result = "";
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("functionCode", dto.getFunctionCode()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("code", dto.getCode()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("name", dto.getName()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("aliasBusinessName", dto.getAliasBusinessName()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("initialBirthday", dto.getInitialBirthday()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("finalBirthday", dto.getFinalBirthday()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("initialBirthdayComplete", dto.getInitialBirthdayComplete())); // date
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("finalBirthdayComplete", dto.getFinalBirthdayComplete())); // date
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("indicatorCode", dto.getIndicatorCode()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("indicatorName", dto.getIndicatorName()));

        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("initialTimeWorkingCycles", dto.getInitialTimeWorkingCycles()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("finalTimeWorkingCycles", dto.getFinalTimeWorkingCycles()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("initialCurrentCycle", dto.getInitialCurrentCycle()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("finalCurrentCycle", dto.getFinalCurrentCycle()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("initialFirstOrderCycle", dto.getInitialFirstOrderCycle()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("finalFirstOrderCycle", dto.getFinalFirstOrderCycle()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("initialCeaseCycle", dto.getInitialCeaseCycle()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("finalCeaseCycle", dto.getFinalCeaseCycle()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("initialReactivatedCycle", dto.getInitialReactivatedCycle()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("finalReactivatedCycle", dto.getFinalReactivatedCycle()));

        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("initialInactiveCycles", dto.getInitialInactiveCycles()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("finalInactiveCycles", dto.getFinalInactiveCycles()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("initialFirstOrderDate", dto.getInitialFirstOrderDate())); // date
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("finalFirstOrderDate", dto.getFinalFirstOrderDate())); // date
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("initialAllocationDate", dto.getInitialAllocationDate())); // date
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("finalAllocationDate", dto.getFinalAllocationDate())); // date
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("blocked", dto.getBlocked()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("comercialSituation", dto.getComercialSituation()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("businessRoleActive", dto.getBusinessRoleActive()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("businessRoleInactive", dto.getBusinessRoleInactive()));

        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("trainingSituation", dto.getTrainingSituation()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("initialRegistrationDate", dto.getInitialRegistrationDate())); // date
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("finalRegistrationDate", dto.getFinalRegistrationDate())); // date
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("registrationSituation", dto.getRegistrationSituation()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("registrationOrigin", dto.getRegistrationOrigin()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("expiredData", dto.getExpiredData()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("allowedDisclosureData", dto.getAllowedDisclosureData()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("leaderCode", dto.getLeaderCode()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("groupCode", dto.getGroupCode()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("searchWholeNetwork", dto.getSearchWholeNetwork()));

        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("geographicalStructureCode", dto.getGeographicalStructureCode()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("commercialStructureCode", dto.getCommercialStructureCode()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("email", dto.getEmail()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("document", dto.getDocument()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("telephone", dto.getTelephone()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("inDebit", dto.getInDebit()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("includeOptions", dto.getIncludeOptions()));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("roleCode", dto.getRoleCode()));

        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("sortOptions", sortOptions));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("page", page));
        result += QueryParamUtil.and(result.isEmpty(), QueryParamUtil.convertToQueryParam("pageSize", pageSize));
        return result;
    }

}
