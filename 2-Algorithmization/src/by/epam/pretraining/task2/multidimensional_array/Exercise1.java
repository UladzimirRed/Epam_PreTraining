package by.epam.pretraining.task2.multidimensional_array;

/*
 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */

import java.util.Random;
import java.util.Scanner;

public class Exercise1 {

    private static int[][] matrix;
    private static int range = 10; // заполняем матрицу числами от 0 до range;

    public static void run() {
        matrix = initialize();
        printMatrix();
        printColumnsByCondition();
    }

    private static int[][] initialize() {
        int m;
        int n;

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter matrix size (first int number)");
        while (!scanner.hasNextInt() || (m = scanner.nextInt()) <= 0) {
            scanner.nextLine();
            System.out.println("Please enter positive INTEGER number");
        }
        System.out.println("Enter matrix size (second int number)");
        while (!scanner.hasNextInt() || (n = scanner.nextInt()) <= 0) {
            scanner.nextLine();
            System.out.println("Please enter positive INTEGER number");
        }
        matrix = new int[m][n];

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

    private static void printColumnsByCondition() {
        System.out.println("Print columns by condition: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j += 2) {
                if (matrix[0][j] > matrix[matrix.length - 1][j]) {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
            System.out.print("\n");
        }
        System.out.println("------------------------");
    }
}
