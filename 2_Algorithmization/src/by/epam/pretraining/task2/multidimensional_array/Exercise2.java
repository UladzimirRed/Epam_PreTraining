package by.epam.pretraining.task2.multidimensional_array;


/*
 * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */


import java.util.Random;
import java.util.Scanner;

public class Exercise2 {

    public static void run() {

        int[][] matrix;
        int range = 10;
        matrix = initialize(range);
        System.out.println("Our matrix is: ");
        print(matrix);
        printItemsDiagonally(matrix);


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
                matrix[i][j] = random.nextInt(range + 1);
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

    private static void printItemsDiagonally(int[][] matrix) {

        System.out.print("Elements of the first diagonal: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        System.out.print("\nElements of the second diagonal: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][matrix.length - 1 - i] + " ");
        }
    }


}
