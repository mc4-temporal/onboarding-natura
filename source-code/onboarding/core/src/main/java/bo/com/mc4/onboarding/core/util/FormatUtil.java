package bo.com.mc4.onboarding.core.util;

public class FormatUtil {
    public static final String MSG_TITLE_ERROR="ERROR";

    public static String defaultError(){
        return "Ocurrió un error inesperado";
    }

    public static String requerido(String campo){
        return "Debe completar el campo '"+campo+"'.";
    }

    public static String yaRegistrado(String objeto,String campo,String valor){
        return yaRegistrado(objeto,campo,valor,null);
    }

    public static String yaRegistrado(String objeto,String campo,String valor, Integer fila){
        return "Ya se encuentra registrado un '"+objeto+"' con el campo '"+campo+"'="+valor+(fila!=null?", para la fila: "+fila:"");
    }

    public static String coincidencia(String valor01,String valor02){
        return "El campo '"+valor01+"' no coincide con el campo '"+valor02+"'.";
    }

    public static String noRegistrado(String objeto,Long id){
        return "No se encontró registrado un '"+objeto+"' con el identificador'"+id+"'.";
    }

    public static String noRegistrado(String objeto, String campo, String valor){
        return "No se encontró registrado un '"+objeto+"' con '" + campo + "': "+valor+".";
    }

    public static String noRegistrado(String objeto,Integer id){
        return "No se encontr\u00f3 registrado un '"+objeto+"' tipo '"+id+"'.";
    }

    public static String noHabilitado(String objeto,Long id){
        return "El '"+objeto+"' con el identificador'"+id+"' no se encuentra habilitado.";
    }

    public static String noHabilitado(String objeto, String accion) {
        return "El objeto '"+objeto+"' no se encuentra habilitado para" + accion;
    }

    public static String tipoIncorrecto(String campo,String tipo){
        return "El campo '"+campo+"' no es del tipo correcto '"+tipo+"'.";
    }

    public static String sinValor(String campo, String objeto, Long id) {
        return "El campo '" + campo + "' del objeto '" + objeto + "' con id " + id + " no tiene valor asignado";
    }

    public static String yaHabilitado(String objeto, Long id) {
        return "El '"+objeto+"' con el identificador'"+id+"' ya se encuentra habilitado.";
    }

    public static String yaInhabilitado(String objeto, Long id) {
        return "El '"+objeto+"' con el identificador'"+id+"' ya se encuentra inhabilitado.";
    }

    public static String noRegistrado(String objeto,String id){
        return "No se encontr\u00f3 registrado un '"+objeto+"' tipo '"+id+"'.";
    }
}
