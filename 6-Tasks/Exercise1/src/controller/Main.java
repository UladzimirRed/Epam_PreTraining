package controller;

import entity.Book;
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
        boolean isExecute = true;

        System.out.println("Enter your login");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

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
            if (userRole.equals(Role.USER)) {
                System.out.println("Welcome " + client.getName());
                System.out.println("What should be done? \n" +
                        "1. Find a book by criteria - 1 \n" +
                        "2. Display all books- 2 \n" +
                        "3. Leave library - 3");
            }
            if (userRole.equals(Role.ADMIN)) {
                System.out.println("Welcome " + client.getName());
                System.out.println("What should be done? \n" +
                        "1. Find a book by Name or Author - 1 \n" +
                        "2. Display all books- 2 \n" +
                        "3. Leave library - 3 \n" +
                        "4. Add book - 4 \n" +
                        "5. Remove book - 5");
            }
            while (isExecute) {
                while (!scanner.hasNextByte()) {
                    scanner.next();
                    System.out.println("Enter integer number");
                }
                byte choice = scanner.nextByte();
                switch (choice) {
                    case 1:
                        System.out.println("Enter keyword");
                        Scanner criteriaScan = new Scanner(System.in);
                        String criteria = criteriaScan.nextLine();
                        printBooks(catalog.findBooks(criteria));
                        if (catalog.findBooks(criteria) == null) {
                            System.out.println("No matching books found");
                        }
                        System.out.println("Make your choice");
                        break;
                    case 2:
                        printBooks(books);
                        System.out.println("Make your choice");
                        break;
                    case 3:
                        isExecute = false;
                        System.out.println("Teaching is light, ignorance - darkness. Bye Bye");
                        System.out.println("Make your choice");
                        break;
                    case 4:
                        Book newBook = null;
                        System.out.println("Specify author");
                        newBook.setAuthor(scanner.nextLine() + "; ");
                        System.out.println("Specify title");
                        newBook.setAuthor(scanner.nextLine() + "; ");
                        System.out.println("Indicate type: 'PAPER_BOOK' or 'E_BOOK'");
                        newBook.setBookType(scanner.nextLine() + "; ");
                        System.out.println("Make your choice");
                        break;
                    case 5:
                        System.out.println("Enter the title of the book you want to delete");


                    default:
                        System.out.println("Wrong command!!!\n");
                }
            }
        } else {
            System.out.println("User is not found");
        }

    }

}
