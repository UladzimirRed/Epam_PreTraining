package by.epam.pretraining.task1.conditional;

public class Exercise5 {

    public static void run() {

        double x = 3;

        System.out.println("The value of the function is: " + findValueOfFunction(x));
    }

    private static double findValueOfFunction(double x) {
        double result;
        if (x <= 3) {
            result = Math.pow(x, 2) - 3 * x + 9;
        } else result = 1 / (Math.pow(x, 3) + 6);

        return result;
    }
}
