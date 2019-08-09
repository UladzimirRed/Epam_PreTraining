package util;

import java.util.Arrays;
import java.util.Base64;

public class PasswordEncoder {
    public static String encode(String str) {
        byte[] bytes = str.getBytes();
        return Base64.getEncoder().encodeToString(bytes);
    }

    public static String decode (String str){
        byte[] byteArray = Base64.getDecoder().decode(str);
        return new String(byteArray);
    }
}
