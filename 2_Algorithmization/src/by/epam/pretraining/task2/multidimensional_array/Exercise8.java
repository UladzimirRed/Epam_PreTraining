package by.epam.pretraining.task2.multidimensional_array;


/*
 * В числовой матрице поменять местами два любых столбца, т.е. все элементы
 * одного столбца поставить на соответствующие им позиции другого, а элементы
 * второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.
 */


import java.util.Random;
import java.util.Scanner;

public class Exercise8 {

    private static int[][] matrix;
    private static int[][] replacedMatrix;
    private static int range = 10;


    public static void run() {

        matrix = initialize();
        System.out.println("Our matrix is: ");
        printMatrix(matrix);
        replacedMatrix = replaceColumnItems();
        System.out.println("The result of the program: ");
        printMatrix(replacedMatrix);
        System.out.println("------------------------");

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
                matrix[i][j] = random.nextInt(range) + 1;
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

    private static int[][] replaceColumnItems() {

        int a;
        int b;
        int temp;

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first column number that need to be swapped (one integer int number)");

        while (!scanner.hasNextInt() || (a = scanner.nextInt() - 1) >= matrix.length || a < 0) {
            scanner.nextLine();
            System.out.println("Please enter only INTEGER number in the range from 1 to " + matrix.length);
        }

        System.out.println("Enter second column number that need to be swapped (one integer int number)");

        while (!scanner.hasNextInt() || (b = scanner.nextInt() - 1) >= matrix.length || b < 0) {
            scanner.nextLine();
            System.out.println("Please enter only INTEGER number in the range from 1 to " + matrix.length);
        }

        for (int i = 0; i < matrix.length; i++) {
            temp = matrix[i][a];
            matrix[i][a] = matrix[i][b];
            matrix[i][b] = temp;
        }

        return matrix;

    }
}
