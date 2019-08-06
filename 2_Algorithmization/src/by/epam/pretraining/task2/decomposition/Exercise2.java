package by.epam.pretraining.task2.decomposition;

/**
 * Написать метод(методы) для нахождения наибольшего общего делителя четырех
 * натуральных чисел.
 */

import java.util.Scanner;

public class Exercise2 {

    private static int greatestCommonDivisor;
    private static int[] arrayOfnumbers;

    public static void run() {
        arrayOfnumbers = fillArray(4);
        System.out.print("You entered four numbers:");
        printArray(arrayOfnumbers);
        greatestCommonDivisor = findGreatestCommonDivisor(arrayOfnumbers);
        System.out.println("\nGreatest common divisor for these numbers is: " + greatestCommonDivisor);
    }

    private static int[] fillArray(int n) {

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[n];
        System.out.println("Please enter four integer number");
        for (int i = 0; i < n; i++) {
            while (!scanner.hasNextInt() || (array[i] = scanner.nextInt()) <= 0) {
                scanner.nextLine();
                System.out.println("Please enter POSITIVE INTEGER number");
            }
        }
        return array;
    }

    private static int findGreatestCommonDivisor(int[] arrayOfnumbers) {
        int firstnumber = Math.abs(arrayOfnumbers[0]);
        for (int element : arrayOfnumbers) {
            int secondNumber = Math.abs(element);
            while (firstnumber != 0 && secondNumber != 0) {
                if (firstnumber > secondNumber) {
                    firstnumber %= secondNumber;
                } else {
                    secondNumber %= firstnumber;
                }
            }
            firstnumber += secondNumber;
        }
        return firstnumber;
    }

    private static void printArray(int[] array) {
        for (int x : array) {
            System.out.print(x + " ");
        }
    }
}
