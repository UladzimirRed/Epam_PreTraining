package by.epam.pretraining.task2.multidimensional_array;


/*
 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */


import java.util.Random;
import java.util.Scanner;

public class Exercise1 {

    public static void run() {

        int[][] matrix;
        int range = 10; // заполняем матрицу числами от 0 до range;

        matrix = initialize(range);
        printMatrix(matrix);
        printColumnsByCondition(matrix);

    }

    private static int[][] initialize(int range) {

        int m;
        int n;

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter matrix size (one int number)");

        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Please enter INTEGER number");
        }
        n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(range + 1);
            }
        }

        return matrix;
    }

    private static void printMatrix(int[][] matrix) {

        System.out.println("Our matrix is: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }

    private static void printColumnsByCondition(int[][] matrix) {

        System.out.println("Print columns by condition: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j += 2) {
                if (matrix[0][j] > matrix[matrix.length - 1][j]) {
                    System.out.print(matrix[i][j] + "\t");
                }
            }

        }

        System.out.println("\n------------------------");

    }

}
