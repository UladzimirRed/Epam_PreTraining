package util;

import entity.Book;
import entity.BookType;

public class BookBuilder {
    private static final String DELIMITER = ";\\s*";

    public static Book buildBook(String line) {
        if (!BookValidator.validate(line)) {
            return null;
        }
        String[] elements = line.split(DELIMITER);
        BookType type = BookEnumExtractor.findBookType(elements[2]);

        if (type == null) {
            return null;
        }
        return new Book(elements[0], elements[1], type);
    }
}
