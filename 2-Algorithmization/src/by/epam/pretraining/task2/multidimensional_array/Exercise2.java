package by.epam.pretraining.task2.multidimensional_array;

/*
 * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */

import java.util.Random;
import java.util.Scanner;

public class Exercise2 {

    private static int[][] matrix;
    private static int range = 10;

    public static void run() {
        matrix = initialize();
        printMatrix();
        printItemsDiagonally();
    }

    private static int[][] initialize() {
        int m;

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter matrix size (one int number)");
        while (!scanner.hasNextInt() || (m = scanner.nextInt()) <= 0) {
            scanner.nextLine();
            System.out.println("Please enter POSITIVE INTEGER number");
        }
        matrix = new int[m][m];

        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(range + 1);
            }
        }
        return matrix;
    }

    private static void printMatrix() {
        System.out.println("Our matrix is: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static void printItemsDiagonally() {
        System.out.print("Elements of the first diagonal: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        System.out.print("\nElements of the second diagonal: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][matrix.length - 1 - i] + " ");
        }
        System.out.println("\n------------------------");
    }
}
