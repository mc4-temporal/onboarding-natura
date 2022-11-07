package bo.com.mc4.onboarding.model.util;

/**
 * @Created by :MC4
 * @Autor :Ricardo Laredo
 * @Email :rlaredo@mc4.com.bo
 * @Date :9/29/22
 * @Project onboarding-source
 * @Package :bo.com.mc4.onboarding.model.util
 * @Copyright :MC4
 */
public class ResponseDetailUtil {

    public static final String FORMAT_GSON_ERROR = "[{\"codigo\": \"%s\", \"mensaje\": \"%s\"}]";

    public static String getMsgError(String code, String msg) {
        return String.format(FORMAT_GSON_ERROR, code, msg);
    }

    public static String getMsgErrorGenerico(String msg) {
        return String.format(FORMAT_GSON_ERROR, "CMC", msg);
    }


    public static String addMsgError(String arrayMessage, String newMessage) {
        if (StringUtil.isBlank(newMessage))
            return arrayMessage;

        if (StringUtil.isBlank(arrayMessage) || arrayMessage.trim().equals("[]")) {
            arrayMessage = "[" + newMessage + "]";
        } else {
            newMessage = newMessage.trim();
            if (newMessage.startsWith("[") && newMessage.endsWith("]")) {
                newMessage = newMessage.substring(1, newMessage.length() - 1);
            }
            arrayMessage = arrayMessage.trim().replace(",]", "]");

            if (!arrayMessage.trim().contains(newMessage)) {
                arrayMessage = arrayMessage.trim().replace("]", "");
                arrayMessage = arrayMessage + "," + newMessage + "]";
            } else {
                if (arrayMessage.trim().endsWith(newMessage + "]")) { // ya existe y esta al final
                    // do nothing
                } else {
                    arrayMessage = arrayMessage.trim().replace(newMessage, "");
                    arrayMessage = arrayMessage.replace(",,", ",").replace("[,", "[");
                    arrayMessage = arrayMessage.replace("]", "");
                    arrayMessage = arrayMessage + "," + newMessage + "]";
                }
            }
        }
        return arrayMessage;
    }
}
