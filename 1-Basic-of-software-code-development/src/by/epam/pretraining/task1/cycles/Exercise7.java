package by.epam.pretraining.task1.cycles;

/*
 *  Для каждого натурального числа в промежутке от m до n вывести все
 *  делители, кроме единицы и самого числа. m и n вводятся с клавиатуры
 */

import java.util.Scanner;

public class Exercise7 {

    public static void run() {
        int m;
        int n;

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter positive integer number m: ");
        while (!scanner.hasNextInt() || (m = scanner.nextInt()) <= 0) {
            scanner.nextLine();
            System.out.println("Please enter POSITIVE INTEGER number");
        }

        System.out.println("Enter positive integer number m: ");
        while (!scanner.hasNextInt() || (n = scanner.nextInt()) <= 0) {
            scanner.nextLine();
            System.out.println("Please enter POSITIVE INTEGER number");
        }

        outputAllDividers(m, n);
    }

    private static void outputAllDividers(int m, int n) {
        for (int i = m; i <= n; ++i) {
            System.out.print(i + ": ");
            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }

    }
}
