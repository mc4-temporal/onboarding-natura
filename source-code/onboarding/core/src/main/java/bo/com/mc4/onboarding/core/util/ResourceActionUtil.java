package bo.com.mc4.onboarding.core.util;

import bo.com.mc4.onboarding.model.auth.AuthAction;

import java.util.ArrayList;
import java.util.List;

public class ResourceActionUtil {
    public static final String LIST_ACTION_CODE = "listAction";
    public static final String RECORD_ACTION_CODE = "createAction";
    public static final String UPDATE_ACTION_CODE = "updateAction";
    public static final String DELETE_ACTION_CODE = "deleteAction";
    public static final String ENABLE_DISABLE_ACTION = "enableDisableAction";
    public static final String TO_EXCEL_ACTION = "toExcelAction";
    public static final String CONFIG_ACCESS_ACTION = "configAccessAction";
    public static final String VIEW_CERT_ACTION = "viewCertAction";
    public static final String UPDATE_CERT_ACTION = "updateCertAction";
    public static final String DOWN_CERT_ACTION = "downCertAction";
    public static final String VIEW_MESSAGES_ACTION = "viewMessagesAction";
    public static final String VIEW_LOG_ACTION = "viewLogAction";

    public static final String PAUSE_ACTION_CODE = "pauseAction";
    public static final String RESTART_ACTION_CODE = "restartAction";
    public static final String EXECNOW_ACTION_CODE = "execNowAction";
    public static final String HISTORY_ACTION_CODE = "historyAction";
    public static final String REPAIR_ACTION_CODE = "repairAction";

    public static List<AuthAction> accionesBaseList() {
        List<AuthAction> authActionList = new ArrayList<>();
        authActionList.add(AuthAction.builder()
                .code(ResourceActionUtil.LIST_ACTION_CODE)
                .action("Listar")
                .baseAction(true)
                .build());

        authActionList.add(AuthAction.builder()
                .code(ResourceActionUtil.RECORD_ACTION_CODE)
                .action("Registrar")
                .baseAction(true)
                .build());

        authActionList.add(AuthAction.builder()
                .code(ResourceActionUtil.UPDATE_ACTION_CODE)
                .action("Actualizar")
                .baseAction(true)
                .build());

        authActionList.add(AuthAction.builder()
                .code(ResourceActionUtil.DELETE_ACTION_CODE)
                .action("Eliminar")
                .baseAction(true)
                .build());

        authActionList.add(AuthAction.builder()
                .code(ResourceActionUtil.ENABLE_DISABLE_ACTION)
                .action("Habilitar/Inhabilitar")
                .baseAction(true)
                .build());


        authActionList.add(AuthAction.builder()
                .code(TO_EXCEL_ACTION)
                .action("Exportar a Excel")
                .baseAction(true)
                .build());

        authActionList.add(AuthAction.builder()
                .code(CONFIG_ACCESS_ACTION)
                .action("Configurar Acciones")
                .baseAction(true)
                .build());

        authActionList.add(AuthAction.builder()
                .code(VIEW_CERT_ACTION)
                .action("Ver Certificados")
                .baseAction(true)
                .build());

        authActionList.add(AuthAction.builder()
                .code(UPDATE_CERT_ACTION)
                .action("Actualizar Certificado")
                .baseAction(true)
                .build());

        authActionList.add(AuthAction.builder()
                .code(DOWN_CERT_ACTION)
                .action("Descargar Certificado")
                .baseAction(true)
                .build());

        authActionList.add(AuthAction.builder()
                .code(VIEW_MESSAGES_ACTION)
                .action("Ver Mensajes")
                .baseAction(true)
                .build());

        authActionList.add(AuthAction.builder()
                .code(VIEW_LOG_ACTION)
                .action("Ver Log")
                .baseAction(true)
                .build());

        authActionList.add(AuthAction.builder()
                .code(PAUSE_ACTION_CODE)
                .action("Pausar Job")
                .baseAction(true)
                .build());

        authActionList.add(AuthAction.builder()
                .code(RESTART_ACTION_CODE)
                .action("Reiniciar Job")
                .baseAction(true)
                .build());

        authActionList.add(AuthAction.builder()
                .code(EXECNOW_ACTION_CODE)
                .action("Ejecutar Job")
                .baseAction(true)
                .build());

        authActionList.add(AuthAction.builder()
                .code(HISTORY_ACTION_CODE)
                .action("Ver Historial")
                .baseAction(true)
                .build());

        authActionList.add(AuthAction.builder()
                .code(REPAIR_ACTION_CODE)
                .action("Reparar Jobs")
                .baseAction(true)
                .build());
        return authActionList;
    }

    public static final String[] roleActionsCode = {
            LIST_ACTION_CODE,
            RECORD_ACTION_CODE,
            UPDATE_ACTION_CODE,
            DELETE_ACTION_CODE,
            ENABLE_DISABLE_ACTION,
            TO_EXCEL_ACTION
    };

    public static final String[] userActionsCode = {
            LIST_ACTION_CODE,
            RECORD_ACTION_CODE,
            UPDATE_ACTION_CODE,
            DELETE_ACTION_CODE,
            ENABLE_DISABLE_ACTION,
            TO_EXCEL_ACTION
    };

    public static final String[] resourceActionsCode = {
            LIST_ACTION_CODE,
            UPDATE_ACTION_CODE
    };

    public static final String[] accessActionsCode = {
            LIST_ACTION_CODE,
            CONFIG_ACCESS_ACTION
    };

    public static final String[] parameterActionsCode = {
            LIST_ACTION_CODE,
            UPDATE_ACTION_CODE,
            TO_EXCEL_ACTION
    };

    public static final String[] logActionsCode = {
            LIST_ACTION_CODE,
            VIEW_LOG_ACTION,
            TO_EXCEL_ACTION
    };


}
