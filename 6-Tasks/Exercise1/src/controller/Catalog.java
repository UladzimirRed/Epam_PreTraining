package controller;

import entity.Book;
import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private static Catalog instance;
    private List<Book> books = new ArrayList<>();

    private Catalog() {
    }

    public static Catalog getInstance() {
        if (instance == null) {
            instance = new Catalog();
        }
        return instance;
    }

    public void add(Book book) {
        books.add(book);
    }

    public void addBooks(List<Book> books) {
        this.books.addAll(books);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void removeBook(Book book) {
        books.remove(book);
    }


    public List<Book> findBooks(String criteria) {
        List<Book> bookByCriteria = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(criteria)) {
                bookByCriteria.add(book);
            }
            if (book.getTitle().equalsIgnoreCase(criteria)) {
                bookByCriteria.add(book);
            }
            if (book.getBookType().equalsIgnoreCase(criteria)) {
                bookByCriteria.add(book);
            }
        }
        return bookByCriteria;
    }
}
