package by.epam.pretraining.task1.cycles;

import java.util.Scanner;

public class Exercise7 {

    public static void run() {

        System.out.println("Enter integer number m: ");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println("Enter integer number n: ");
        int n = scanner.nextInt();
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
