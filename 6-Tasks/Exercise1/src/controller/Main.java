package controller;

import entity.Book;
import entity.Role;
import entity.User;
import util.BookFileReader;
import util.PasswordEncoder;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;

import static util.Printer.*;

public class Main {
    private static final String FILE_PATH = "6-Tasks/Exercise1/data/catalog.txt";
    private static final String PASSWORD_PATH = "6-Tasks/Exercise1/data/passwords.txt";
    public static void main(String[] args) {

        Catalog catalog = Catalog.getInstance();
        UserData userData = UserData.getInstance();
        BookFileReader fileReader = new BookFileReader();
        List<Book> books = fileReader.read(FILE_PATH);

        catalog.addBooks(books);
        printBooks(catalog.getBooks());
        System.out.println();
        printBooks(catalog.findBooks("eBook"));
        System.out.println();
        printBooks(catalog.findBooks("Булгаков"));

        System.out.println();
        String str = "user1";
        System.out.println(str);
        System.out.println();
        String encoded = PasswordEncoder.encode(str);
        System.out.println(encoded);
        System.out.println();
        String decoded = PasswordEncoder.decode(encoded);
        System.out.println(decoded);

        User admin = new User("Admin", "12345", Role.ADMIN);
        User user = new User("User", "12345", Role.USER);

        userData.add(admin);
        userData.add(user);

        String userName = "Admin";
        String password = "her";
        User adm = userData.findUser(userName);
        System.out.println(adm);

        String encodedPassword = PasswordEncoder.encode(password);
        if (adm.getPassword().equals(encodedPassword)) {
            System.out.println("welcome");
        }


    }
}
