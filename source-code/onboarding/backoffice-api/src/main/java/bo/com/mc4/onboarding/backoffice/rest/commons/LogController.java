package bo.com.mc4.onboarding.backoffice.rest.commons;

import bo.com.mc4.onboarding.core.service.mu.LogService;
import bo.com.mc4.onboarding.core.util.ApiConstants;
import bo.com.mc4.onboarding.core.util.ApiUtil;
import bo.com.mc4.onboarding.core.util.exception.ApiResponseException;
import bo.com.mc4.onboarding.core.util.exception.OperationException;
import bo.com.mc4.onboarding.model.commons.Log;
import bo.com.mc4.onboarding.model.commons.dto.AppLogReq;
import bo.com.mc4.onboarding.model.commons.dto.api.ResponseBody;
import bo.com.mc4.onboarding.model.commons.dto.api.page.ResponsePage;
import bo.com.mc4.onboarding.model.commons.enums.LogType;
import bo.com.mc4.onboarding.model.commons.enums.ProcessType;
import bo.com.mc4.onboarding.model.util.DateUtil;
import bo.com.mc4.onboarding.model.util.StringUtil;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

import static org.springframework.http.ResponseEntity.ok;

@Slf4j
@Tag(name = "Logs", description = "API recepcion de logs externos")
@RestController
@RequestMapping("/api/v1/log")
public class LogController {
    private final LogService logService;

    public LogController(LogService logService) {
        this.logService = logService;
    }

    @PostMapping("/app-client-error")
    @Operation(summary = "Registro de logs de error para aplicaciones",
            description = "Recibe logs de error generados en las aplicaciones",
            tags = {"role"},
            responses = {
                    @ApiResponse(description = "Operación satisfactorio", responseCode = "200", content = @Content(mediaType = "application/json")),
                    @ApiResponse(description = "Registro creado", responseCode = "201", content = @Content(mediaType = "application/json")),
                    @ApiResponse(responseCode = "404", description = "Recurso no encontrado", content = @Content),
                    @ApiResponse(responseCode = "401", description = "Fallo de autentificación", content = @Content(schema = @Schema(hidden = true))),
                    @ApiResponse(responseCode = "403", description = "Acceso Denegado", content = @Content(schema = @Schema(hidden = true))),
            }, security = @SecurityRequirement(name = "bearerToken"))
    public ResponseEntity<ResponseBody<Boolean>> getRoleList(@RequestParam("proccess") ProcessType processType,
                                                             @RequestParam("level") LogType level,
                                                             @RequestBody AppLogReq appLogReq,
                                                             @AuthenticationPrincipal Authentication authentication) {
        try {
            if (level == null) level = LogType.ERROR;
            String username = "SYSTEM";
            if (authentication.getPrincipal() != null) {
                User userAuth = (User) authentication.getPrincipal();
                if (userAuth != null) {
                    username = userAuth.getUsername();
                }
            }
            switch (level) {
                case INFO:
                    this.logService.infoApp(processType, appLogReq.getMessage(), appLogReq.getPagina(), username, appLogReq.getStack());
                    break;
                case WARNING:
                    this.logService.warningApp(processType, appLogReq.getMessage(), appLogReq.getPagina(), username, appLogReq.getStack());
                    break;
                case ERROR:
                    this.logService.errorApp(processType, appLogReq.getMessage(), appLogReq.getPagina(), username, appLogReq.getStack());
                    break;
            }
            return ok(ApiUtil.buildResponseWithDefaults(true));
        } catch (OperationException e) {
            log.error("Error: Se produjo un error controlado al ejecutar el servicio, Mensaje: {}", e.getMessage());
            throw ApiResponseException.badRequest(e.getMessage());
        } catch (Exception e) {
            log.error("Error: Se produjo un error genérico al ejecutar el servicio: ", e);
            throw ApiResponseException.serverError(ApiConstants.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/list-by-filters")
    public ResponseEntity<ResponseBody<ResponsePage<Log>>> listPageableByDates(
            @RequestParam(value = "page", defaultValue = "0") Integer page,
            @RequestParam(value = "size", defaultValue = "10") Integer size,
            @RequestParam(value = "sortBy", defaultValue = "id") String sortBy,
            @RequestParam(value = "sortDir", defaultValue = "DESC") Sort.Direction sortDir,
            @RequestParam(value = "process", required = false) String proceso,
            @RequestParam("from") @DateTimeFormat(pattern = DateUtil.FORMAT_DATE_PARAM_URL) Date from,
            @RequestParam("to") @DateTimeFormat(pattern = DateUtil.FORMAT_DATE_PARAM_URL) Date to,
            @RequestParam("q") String message) {

        ProcessType procesoSfe = null;
        if (!StringUtil.isEmptyOrNull(proceso) && !proceso.equals("null")) {
            procesoSfe = ProcessType.valueOf(proceso);
        }

        try {
            Pageable pagingSort = ApiUtil.buildPageableWithSort(page, size, sortBy, sortDir);
            Page<Log> result = logService.listPageableByDatesAndType(DateUtil.formatToStart(from), DateUtil.formatToEnd(to), procesoSfe, message, pagingSort);
            return ok(ApiUtil.buildResponseWithDefaults(ApiUtil.buildResponsePaged(result, result.getContent())));
        } catch (OperationException e) {
            log.error("Error: Se produjo un error controlado al ejecutar el servicio, Mensaje: {}", e.getMessage());
            throw ApiResponseException.badRequest(e.getMessage());
        } catch (Exception e) {
            log.error("Error: Se produjo un error genérico al ejecutar el servicio: ", e);
            throw ApiResponseException.serverError(ApiConstants.INTERNAL_SERVER_ERROR);
        }
    }

}
