package util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BookValidator {
    private static final Pattern LINE_PATTERN = Pattern.compile("^([^;]*;){2}[^;]*$");

    public static boolean validate(String line) {
        Matcher matcher = LINE_PATTERN.matcher(line);
        return matcher.matches();
    }
}
