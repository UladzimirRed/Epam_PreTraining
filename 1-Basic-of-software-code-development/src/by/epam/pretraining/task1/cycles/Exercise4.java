package by.epam.pretraining.task1.cycles;

/*
 *  Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

public class Exercise4 {

    public static void run() {
        int n = 5;
        System.out.println("Product of squares first 5 numbers is: " + findSumOfSquares(n));
    }

    private static double findSumOfSquares(int n) {
        double product = 1;
        for (int i = 1; i <= n; i++) {
            product = product * Math.pow(i, 2);
        }
        return product;
    }
}
