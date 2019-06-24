package by.epam.pretraining.task2.multidimensional_array;


/*
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */


import java.util.Random;
import java.util.Scanner;

public class Exercise3 {

    public static void run() {

        int[][] matrix;
        int range = 10;
        matrix = initialize(range);
        System.out.println("Our matrix is: ");
        print(matrix);
        int k = defineLine(matrix);
        int p = defineColumn(matrix);
        printSpecificLineAndColumn(matrix, k, p);

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

    private static void print(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }

    private static int defineLine(int matrix[][]) {

        int k;

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the line number k to display (one int numbers):");

        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Please enter only INTEGER number");
        }

        k = scanner.nextInt();

        if (k <= matrix.length && k > 0) {
            return k;
        } else {
            System.out.println("Wrong number of the line. Number should be less or equal then " + matrix.length);
            k = scanner.nextInt();
        }

        return k;

    }

    private static int defineColumn(int matrix[][]) {

        int p;

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the column number p to display (one int numbers):");

        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Please enter only INTEGER number");
        }

        p = scanner.nextInt();

        if (p <= matrix.length && p > 0) {
            return p;
        } else {
            System.out.println("Wrong number of the column. Number should be less or equal then " + matrix.length);
            p = scanner.nextInt();
        }
        return p;

    }


    private static void printSpecificLineAndColumn(int[][] matrix, int k, int p) {

        System.out.print("Line #" + k + " is: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[k-1][i] + " ");
        }

        System.out.print("\nColumn #" + p + " is: ");
        for (int j = 0; j < matrix.length; j++) {
            System.out.print(matrix[j][p-1] + " ");
        }

    }


}


