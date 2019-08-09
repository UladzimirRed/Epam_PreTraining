package util;

import entity.Role;

public class UserEnumExtractor {
    public static Role findUserRole(String enumString) {
        if (enumString == null) {
            System.out.println("String method parameter is null");
            return null;
        }
        try {
            return Role.valueOf(enumString);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
