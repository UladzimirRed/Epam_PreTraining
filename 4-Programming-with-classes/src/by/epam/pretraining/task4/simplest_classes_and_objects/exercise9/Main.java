package by.epam.pretraining.task4.simplest_classes_and_objects.exercise9;

public class Main {
    public static void main(String[] args) {
        Book[] books = {
                new Book(1, "1984", new String[]{"George Orwell"}, "unknown publisher",
                        1949, 351, 21, "Hardcover"),
                new Book(2, "Pride and Prejudice", new String[]{"Jane Austen"}, "unknown publisher",
                        1813, 1450, 25, "Hardcover"),
                new Book(3, "One hundred years of solitude", new String[]{"Garcia Marquez"}, "unknown publisher",
                        1967, 583, 30, "Hardcover"),
                new Book(4, "Brave new world", new String[]{"Aldous Huxley"}, "unknown publisher",
                        1932, 415, 16, "Softcover"),
                new Book(4, "Clockwork Orange", new String[]{"Anthony Burgess"}, "unknown publisher",
                        1962, 819, 19, "Softcover"),
                new Book(5, "Roadside Picnic", new String[]{"Arkady Strugatsky", "Boris Strugatsky"}, "Young guard",
                        1972, 726, 12, "Hardcover")};
        Library library = new Library(books);
        System.out.println("Books by author:");
        library.getBooksByAuthor("George Orwell");
        System.out.println("Books by publisher: ");
        library.getBooksByPublisher("Young guard");
        System.out.println("Books after year: ");
        library.getBooksAfterYear(1932);
    }
}
