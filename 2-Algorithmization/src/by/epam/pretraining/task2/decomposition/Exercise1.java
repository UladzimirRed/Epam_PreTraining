package by.epam.pretraining.task2.decomposition;

/**
 * Написать метод(методы) для нахождения наибольшего общего делителя и
 * наименьшего общего кратного двух натуральных чисел:
 * НОК(А,В) = A*B / НОД(A,B)
 */

import java.util.Scanner;

public class Exercise1 {

    private static int firstNumber;
    private static int secondNumber;
    private static int greatestCommonDivisor;
    private static int leastCommonMultiple;

    public static void run() {

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first integer number");
        while (!scanner.hasNextInt() || (firstNumber = scanner.nextInt()) <= 0) {
            scanner.nextLine();
            System.out.println("Please enter POSITIVE INTEGER number");
        }
        System.out.println("Enter second integer number");
        while (!scanner.hasNextInt() || (secondNumber = scanner.nextInt()) <= 0) {
            scanner.nextLine();
            System.out.println("Please enter POSITIVE INTEGER number");
        }

        greatestCommonDivisor = findGreatestCommonDivisor(firstNumber, secondNumber);
        System.out.println("Greatest common divisor of " + firstNumber + " and " + secondNumber + " is: " + greatestCommonDivisor);
        leastCommonMultiple = findLeastCommonMultiple(firstNumber, secondNumber);
        System.out.println("LeastCommonMultiple of " + firstNumber + " and " + secondNumber + " is: " + leastCommonMultiple);
    }

    private static int findGreatestCommonDivisor(int firstNumber, int secondNumber) {
        firstNumber = Math.abs(firstNumber);
        secondNumber = Math.abs(secondNumber);
        for (int i = 0; i < 2; i++) {
            while (firstNumber != 0 && secondNumber != 0) {
                if (firstNumber > secondNumber) {
                    firstNumber %= secondNumber;
                } else {
                    secondNumber %= firstNumber;
                }
            }
            firstNumber += secondNumber;
        }
        return firstNumber;
    }

    private static int findLeastCommonMultiple(int firstNumber, int secondNumber) {
        return Math.abs(firstNumber * secondNumber / findGreatestCommonDivisor(firstNumber, secondNumber));
    }
}
