package by.epam.pretraining.task1.cycles;

/*
 * Напишите программу, где пользователь вводит любое целое положительное
 * число. А программа суммирует все числа от 1 до введенного
 * пользователем числа.
 */

import java.util.Scanner;

public class Exercise1 {

    public static void run() {
        int n;

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter positive integer number n: ");
        while (!scanner.hasNextInt() || (n = scanner.nextInt()) <= 0) {
            scanner.nextLine();
            System.out.println("Please enter POSITIVE INTEGER number");
        }

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
