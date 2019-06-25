package by.epam.pretraining.task2.multidimensional_array;


/*
 * В числовой матрице поменять местами два любых столбца, т.е. все элементы
 * одного столбца поставить на соответствующие им позиции другого, а элементы
 * второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.
 */


import java.util.Random;
import java.util.Scanner;

public class Exercise8 {

    public static void run() {

        int[][] matrix;
        int[][] replacedMatrix;
        int range = 10;
        matrix = initialize(range);
        System.out.println("Our matrix is: ");
        printMatrix(matrix);
        replacedMatrix = replaceColumnItems(matrix);
        System.out.println("The result of the program: ");
        printMatrix(replacedMatrix);
        System.out.println("------------------------");

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

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

    }

    private static int[][] replaceColumnItems(int[][] matrix) {

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
