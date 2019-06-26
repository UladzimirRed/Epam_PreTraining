package by.epam.pretraining.task2.multidimensional_array;


/*
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */


import java.util.Random;
import java.util.Scanner;

public class Exercise3 {

    private static int[][] matrix;
    private static int range = 10;


    public static void run() {

        matrix = initialize();
        printMatrix();
        int k = defineLine();
        int p = defineColumn();
        printSpecificLineAndColumn(k, p);

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
                matrix[i][j] = random.nextInt(range) + 1;
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

    private static int defineLine() {

        int k;

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the line number k to display (one int numbers):");

        while (!scanner.hasNextInt() || (k = scanner.nextInt()) > matrix.length || (k <= 0)) {
            scanner.nextLine();
            System.out.println("Please enter only INTEGER number in the range from 1 to " + matrix.length);
        }

        return k;

    }

    private static int defineColumn() {

        int p;

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the column number p to display (one int numbers):");

        while (!scanner.hasNextInt() || (p = scanner.nextInt()) > matrix.length || (p <= 0)) {
            scanner.nextLine();
            System.out.println("Please enter only INTEGER number in the range from 1 to " + matrix.length);
        }

        return p;

    }


    private static void printSpecificLineAndColumn(int k, int p) {

        System.out.print("Line #" + k + " is: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[k - 1][i] + " ");
        }

        System.out.print("\nColumn #" + p + " is: ");
        for (int j = 0; j < matrix.length; j++) {
            System.out.print(matrix[j][p - 1] + " ");
        }

        System.out.println("\n------------------------");

    }

}


