package by.epam.pretraining.task1.cycles;

/*
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

import java.util.Scanner;

public class Exercise8 {

    public static void run() {
        int a;
        int b;

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer number a: ");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Please enter POSITIVE INTEGER number");
        }
        a = scanner.nextInt();

        System.out.println("Enter integer number b: ");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Please enter INTEGER number");
        }
        b = scanner.nextInt();

        findMatchingDigitsInTwoNumbers(a, b);
    }

    private static void findMatchingDigitsInTwoNumbers(int a, int b) {
        int d;
        int c;
        while (a > 0) {
            d = a % 10;
            a = a / 10;
            c = b;
            while (c > 0)  {
                if (c % 10 == d) {
                    System.out.print(d + " ");
                }
                c = c / 10;
            }
        }
        System.out.println();
    }
}
