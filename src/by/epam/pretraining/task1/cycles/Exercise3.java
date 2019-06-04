package by.epam.pretraining.task1.cycles;

public class Exercise3 {

    public static void run() {

        int n = 100;
        System.out.println("Sum of squares first 100 numbers is: " + findSumOfSquares(n));

    }

    private static int findSumOfSquares(int n) {

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i, 2);
        }

        return sum;
    }
}
