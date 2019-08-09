package util;

import entity.Book;
import exception.FileReadingException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookFileReader {

    public List<Book> read(String pathToFile) {
        if (pathToFile == null) {
            throw new FileReadingException("Null path to file in read method");
        }

        File file = new File(pathToFile);
        List<Book> books = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                Book book = BookBuilder.buildBook(scanner.nextLine());
                if (book != null) {
                    books.add(book);
                }
            }
            return books;
        } catch (FileNotFoundException e) {
            throw new FileReadingException("Error in reading file: " + e.getMessage(), e);
        }
    }
}

