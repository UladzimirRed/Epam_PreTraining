package by.epam.pretraining.task4.simplest_classes_and_objects.exercise9;

public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void getBooksByAuthor(String author) {
        boolean haveAuthor = false;
        for (Book book : books) {
            for (String str : book.getAuthors()) {
                if (str.equalsIgnoreCase(author)) {
                    System.out.println(book);
                    haveAuthor = true;
                }
            }
        }
        if (!haveAuthor) {
            System.out.println("There are no books of the author in the book store!");
        }
    }

    public void getBooksByPublisher(String publisher) {
        boolean havePub = false;
        for (Book book : books) {
            if (book.getPublisher().equalsIgnoreCase(publisher)) {
                System.out.println(book);
                havePub = true;
            }
        }
        if (!havePub) {
            System.out.println("There are no books of the publisher in the book store!");
        }
    }

    public void getBooksAfterYear(int year) {
        boolean afterYear = false;
        for (Book book : books) {
            if (book.getYear() > year) {
                System.out.println(book);
                afterYear = true;
            }
        }
        if (!afterYear) {
            System.out.println("There are no books after " + year + " in the book store!");
        }
    }
}
