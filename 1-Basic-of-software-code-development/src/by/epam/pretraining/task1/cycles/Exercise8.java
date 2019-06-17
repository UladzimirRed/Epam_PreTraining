package by.epam.pretraining.task1.cycles;

import java.util.Scanner;

public class Exercise8 {

    public static void run() {

        System.out.println("Enter integer number a: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Enter integer number b: ");
        int b = scanner.nextInt();
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
