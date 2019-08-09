package util;

import entity.Book;
import java.util.List;

public class Printer {

    public static void print(Book book) {
        System.out.println(book.toString());
    }

    public static void printBooks(List<Book> books) {
        for (Book book : books) {
            print(book);
        }
    }
}
