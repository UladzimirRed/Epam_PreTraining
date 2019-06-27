package by.epam.pretraining.task1.conditional;

/*
 * Вычислить значение функции:
 * x^2 - 3x + 9, если x <= 3;
 * 1 / (x^2 + 6), если x > 3.
 */

public class Exercise5 {

    public static void run() {

        double x = 3;

        System.out.println("The value of the function is: " + findValueOfFunction(x));
    }

    private static double findValueOfFunction(double x) {

        if (x <= 3) {
            return Math.pow(x, 2) - 3 * x + 9;
        }
        return 1 / (Math.pow(x, 3) + 6);
    }
}
