package util;

import entity.Book;
import entity.BookType;
import entity.Role;
import entity.User;

public class UserBuilder {
    private static final String DELIMITER = ";\\s*";

    public static User buildUser(String line) {

        if (!UserValidator.validate(line)) {
            return null;
        }

        String[] elements = line.split(DELIMITER);
        Role role = UserEnumExtractor.findUserRole(elements[2]);

        if (role == null) {
            return null;
        }
        return new User(elements[0], elements[1], role);
    }
}
