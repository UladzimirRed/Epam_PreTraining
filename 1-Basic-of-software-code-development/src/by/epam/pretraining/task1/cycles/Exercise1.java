package by.epam.pretraining.task1.cycles;

import java.util.Scanner;

public class Exercise1 {

    public static void run() {

        System.out.println("Enter integer number n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("Sum of numbers from 1 to n is: " + calculateSum(n));
    }

    private static int calculateSum(int n) {

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }
}
