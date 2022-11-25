package bo.com.mc4.onboarding.integrations.util;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * QueryParamUtil
 *
 * @author Marcos Quispe
 * @since 1.0
 */
public class QueryParamUtil {

    public static String and(boolean isResultEmpty, String newQueryParam) {
        if (newQueryParam == null || newQueryParam.isEmpty())
            return "";

        return (isResultEmpty ? "" : "&") + newQueryParam;
    }

    public static <T> String convertToQueryParam(String name, T value) {
        if (value == null || (value instanceof String && ((String) value).trim().isEmpty()))
            return "";

        if (value instanceof String) {
            return name + "=" + encodeQueryParamsURL(((String) value).trim());
        } else {
            return name + "=" + value.toString();
        }
    }

    public static <T> String convertToQueryParam(String name, List<T> list) {
        if (list == null || list.isEmpty())
            return "";

        String result = "";
        for (Object value : list) {
            if (value != null) {
                if (value instanceof String) {
                    result += (result.isEmpty() ? "" : "&") + name + "=" + encodeQueryParamsURL(value.toString());

                } else if (value instanceof Date) {
                    result += (result.isEmpty() ? "" : "&") + name + "=" + value.toString(); // TODO modificar para parsear Date a String

                } else {
                    result += (result.isEmpty() ? "" : "&") + name + "=" + value.toString();
                }
            }
        }
        return result;
    }

    public static String encodeQueryParamsURL(String text) {
        if (text == null || text.trim().isEmpty())
            return "";

        String result = "";
        text = text.trim();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                result += "%20";
            } else {
                result += text.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        List<String> nameList = Arrays.asList("a a", "b", "c");
        List<Integer> codeList = Arrays.asList(1, 2, 3);

        System.out.println(convertToQueryParam("name",nameList));
        System.out.println(convertToQueryParam("code",codeList));
    }

}
