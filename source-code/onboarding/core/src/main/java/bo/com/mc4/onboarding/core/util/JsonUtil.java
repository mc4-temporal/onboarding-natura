package bo.com.mc4.onboarding.core.util;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by :MC4
 * Author :Ricardo Laredo
 * Email :rlaredo@mc4.com.bo
 * Date :6/30/22
 * Project onboarding-source
 * Package :bo.com.mc4.onboarding.core.util
 * Copyright :MC4
 */
public class JsonUtil {
    public static String toString(Object object){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }
}
