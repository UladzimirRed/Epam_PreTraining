package by.epam.pretraining.task2.multidimensional_array;


/*
 *  Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран
 *  саму матрицу и номера строк, в которых число 5 встречается три и более раз.
 */


import java.util.Random;

public class Exercise11 {

    private static int[][] matrix;
    private static int range = 15;


    public static void run() {

        matrix = initialize();
        printMatrix();
        findLinesWithRepeatingNumberFive();

    }

    private static int[][] initialize() {

        int n = 10;
        int m = 20;

        matrix = new int[n][m];

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

    private static void findLinesWithRepeatingNumberFive() {

        System.out.print("Line numbers where the number five is written three or more times: ");

        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 5) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.print((i + 1) + " ");
            }

        }

        System.out.println("\n------------------------");

    }

}