package by.epam.pretraining.task2.multidimensional_array;


/*
 *  Задана матрица неотрицательных чисел.
 *  Посчитать сумму элементов в каждом столбце.
 *  Определить, какой столбец содержит максимальную сумму.
 */


import java.util.Random;
import java.util.Scanner;

public class Exercise9 {

    public static void run() {

        int[][] matrix;
        int range = 100;
        matrix = initialize(range);
        printMatrix(matrix);
        findSumOfItemsInEachColumn(matrix);

    }

    private static int[][] initialize(int range) {

        int m;

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter matrix size (one int number)");

        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Please enter INTEGER number");
        }

        m = scanner.nextInt();

        int[][] matrix = new int[m][m];

        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(range) + 1;
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

    private static void findSumOfItemsInEachColumn(int[][] matrix) {

        int maxColumn = 1;
        int maxSum = 0;
        int sum = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][j];
            }
            System.out.println("Sum of items in column #" +  (j + 1) + ": " + sum);
            if (sum > maxSum) {
                maxSum = sum;
                maxColumn = j + 1;
            }
            sum = 0;
        }

        System.out.println("Column #" + maxColumn + " contains the maximum sum.");
        System.out.println("------------------------");

    }

}

