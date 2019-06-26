package by.epam.pretraining.task2.multidimensional_array;


/*
 * Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */


import java.util.Random;
import java.util.Scanner;

public class Exercise15 {

    private static int[][] matrix;
    private static int max;
    private static int range = 100;


    public static void run() {

        matrix = initialize();
        System.out.println("Source matrix is: ");
        printMatrix(matrix);
        max = findMaxValue();
        int[][] rep = replaceOddElementsWithMax();
        System.out.println("Replaced matrix is: ");
        printMatrix(rep);

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

    private static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }

    private static int findMaxValue() {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        System.out.println("Мax element of the original matrix is: " + max);

        return max;
    }

    private static int[][] replaceOddElementsWithMax() {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    matrix[i][j] = max;
                }
            }
        }
        return matrix;

    }


}