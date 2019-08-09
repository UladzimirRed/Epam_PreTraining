package util;

import entity.BookType;

public class BookEnumExtractor {
    public static BookType findBookType(String enumString) {
        if (enumString == null) {
            System.out.println("String method parameter is null");
            return null;
        }
        try {
            return BookType.valueOf(enumString);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
