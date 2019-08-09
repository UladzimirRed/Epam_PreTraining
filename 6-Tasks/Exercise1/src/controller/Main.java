package controller;

import entity.Book;
import entity.Role;
import entity.User;
import util.BookFileReader;
import util.PasswordEncoder;
import util.UserFileReader;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Base64;
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
//        printBooks(catalog.getBooks());
//        System.out.println();
//        printBooks(catalog.findBooks("E_Book"));
//        System.out.println();
//        printBooks(catalog.findBooks("Булгаков"));


//        System.out.println();
//        String str = "user1";
//        System.out.println(str);
//        System.out.println();
//        String encoded = PasswordEncoder.encode(str);
//        System.out.println(encoded);
//        System.out.println();
//        String decoded = PasswordEncoder.decode(encoded);
//        System.out.println(decoded);
        String str2 = "YWRtaW4x";
        System.out.println(str2);
        String encoded2 = PasswordEncoder.decode(str2);
        System.out.println(encoded2);

//        User admin = new User("Admin", "12345", Role.ADMIN);
//        User user1 = new User("User", "12345", Role.USER);

//        userData.add(admin);
//        userData.add(user1);

//        String userName = "Admin";
//        String password = "her";

//        User adm = userData.findUser(userName);
//        System.out.println(adm);

//        String encodedPass = PasswordEncoder.encode(password);
//        if (adm.getPassword().equals(encodedPass)) {
//            System.out.println("welcome");


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

//        while (isExecute) {
//            System.out.println("What should be done? \n" +
//                    "1. Show the whole cave - 1 \n" +
//                    "2. Sort the cavern by gold - 2 \n" +
//                    "3. Get the most expensive gold - 3 \n" +
//                    "4. Get gold in the amount of - 4 \n" +
//                    "5. Leave the cavern - 5");
//
//            while (!scanner.hasNextByte()) {
//                scanner.next();
//                System.out.println("Enter integer number");
//            }
//            byte choice = scanner.nextByte();
//            switch (choice) {
//                case 1:
//                    controller.printGold();
//                    break;
//                case 2:
//                    controller.sortByCost();
//                    controller.printGold();
//                    break;
//                case 3:
//                    controller.getMostExpensiveGold();
//                    break;
//                case 4:
//                    System.out.println("Enter the required sum: ");
//                    while (!scanner.hasNextInt()) {
//                        scanner.next();
//                        System.out.println("Enter integer");
//                    }
//                    int sum = scanner.nextInt();
//                    controller.getGoldBySum(sum);
//                    break;
//                case 5:
//                    isExecute = false;
//                    System.out.println("See you later");
//                    break;
//                default:
//                    System.out.println("Wrong command!!!\n");
//            }

