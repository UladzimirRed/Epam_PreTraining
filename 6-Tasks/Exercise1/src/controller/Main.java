package controller;

/**
 * Создать консольное приложение "Учёт книг в домашней библиотеке".
 */

import entity.Book;
import entity.BookType;
import entity.Role;
import entity.User;
import util.BookFileReader;
import util.PasswordEncoder;
import util.UserFileReader;
import java.util.List;
import java.util.Scanner;

import static util.Printer.*;

public class Main {
    private static final String FILE_PATH = "6-Tasks/Exercise1/data/catalog.txt";
    private static final String PASSWORD_PATH = "6-Tasks/Exercise1/data/passwords.txt";

    public static void main(String[] args) {

        Catalog catalog = Catalog.getInstance();
        BookFileReader fileReader = new BookFileReader();
        List<Book> books = fileReader.read(FILE_PATH);
        catalog.addBooks(books);

        UserData userData = UserData.getInstance();
        UserFileReader userFileReader = new UserFileReader();
        List<User> users = userFileReader.read(PASSWORD_PATH);
        userData.addUsers(users);

        Scanner scanner = new Scanner(System.in);
        String userName = null;
        User user = null;

        while (user == null) {
            System.out.println("Enter your login");
            userName = scanner.nextLine();
            user = userData.findUserByName(userName);
        }
        if (userName.equals(userData.findUserByName(userName).getName())) {
            User client = userData.findUserByName(userName);
            System.out.println("Enter password");
            String userPassword = scanner.nextLine();
            String encodedPassword = PasswordEncoder.encode(userPassword);
            while (!encodedPassword.equals(client.getPassword())) {
                System.out.println("Wrong password. Try again");
                encodedPassword = PasswordEncoder.encode(scanner.nextLine());
            }
            Role userRole = client.getRole();
            System.out.println("Welcome " + client.getName());
            printMenu(userRole);
            boolean isExecute = true;
            while (isExecute) {
                while (!scanner.hasNextByte()) {
                    scanner.next();
                    System.out.println("Enter integer number");
                }
                byte choice = scanner.nextByte();
                switch (choice) {
                    case 1:
                        System.out.println("Enter the search keyword");
                        Scanner criteriaScan = new Scanner(System.in);
                        String criteria = criteriaScan.nextLine();
                        printBooks(catalog.findBooks(criteria));
                        if (catalog.findBooks(criteria).size() == 0) {
                            System.out.println("No matching books found");
                        }
                        printMenu(user.getRole());
                        break;
                    case 2:
                        printBooks(catalog.getBooks());
                        System.out.println();
                        printMenu(user.getRole());
                        break;
                    case 3:
                        isExecute = false;
                        System.out.println("Teaching is light, ignorance - darkness. Bye Bye!");
                        break;
                    case 4:
                        if (!user.getRole().equals(Role.ADMIN)) {
                            System.out.println("You do not have administrator privileges. Make the right choice");
                            printMenu(user.getRole());
                            break;
                        }
                        System.out.println("Specify author");
                        scanner.nextLine();
                        String author = scanner.nextLine();
                        System.out.println("Specify title");
                        String title = scanner.nextLine();
                        System.out.print("Indicate type: \n" +
                                "paper book - 1 \n" +
                                "e book- 2 \n");
                        int type = 0;
                        while (!scanner.hasNextByte() && (type = scanner.nextByte()) != 1 && (type = scanner.nextByte()) != 2) {
                            scanner.next();
                            System.out.println("Enter integer number");
                        }
                        scanner.nextLine();
                        BookType bookType;
                        if (type == 2) {
                            bookType = BookType.E_BOOK;
                        } else {
                            bookType = BookType.PAPER_BOOK;
                        }
                        Book book = new Book(author, title, bookType);
                        catalog.add(book);
                        System.out.println("book was added: " + book);
                        printMenu(user.getRole());
                        break;
                    case 5:
                        if (!user.getRole().equals(Role.ADMIN)) {
                            System.out.println("You do not have administrator privileges. Make the right choice");
                            printMenu(user.getRole());
                            break;
                        }
                        System.out.println("Enter the title and name of the book you want to delete");
                        System.out.println("Specify author");
                        scanner.nextLine();
                        String authorForRemove = scanner.nextLine();
                        System.out.println("Specify title");
                        String titleForRemove = scanner.nextLine();
                        Book bookForRemove = catalog.findByAuthorAndTitle(authorForRemove, titleForRemove);
                        if (bookForRemove != null) {
                            catalog.removeBook(bookForRemove);
                            System.out.println("Book has been removed: " + bookForRemove.toString());
                        } else {
                            System.out.println("Book was not found");
                        }
                        printMenu(user.getRole());
                        break;
                    default:
                        System.out.println("Wrong command!!!\n");
                        printMenu(user.getRole());
                }
            }
        } else {
            System.out.println("User is not found");
        }

    }

    public static void printMenu(Role role) {
        System.out.println("What should be done? \n" +
                "1. Find a book by criteria - 1 \n" +
                "2. Display all books- 2 \n" +
                "3. Leave library - 3");
        if (role.equals(Role.ADMIN)) {
            System.out.println(
                    "4. Add book - 4 \n" + "5. Remove book - 5");
        }
    }
}
