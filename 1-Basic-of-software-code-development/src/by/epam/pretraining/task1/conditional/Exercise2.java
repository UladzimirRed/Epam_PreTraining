package by.epam.pretraining.task1.conditional;

/*
 * Найти max{min(a, b), min(c, d)}.
 */

public class Exercise2 {

    public static void run() {
        int a = 90;
        int b = 45;
        int c = 180;
        int d = 122;

        System.out.println("Max value is: " + findMax(findMin(a, b), findMin(c, d)) );
    }

    private static int findMin (int x, int y) {
        return x < y ? x : y;
    }

    private static int findMax (int x, int y) {
        return x > y ? x : y;
    }

}
