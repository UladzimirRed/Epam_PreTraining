package by.epam.pretraining.task1.linear;

public class Exercise2 {

    public static void run() {

        double a = 2;
        double b = 16;
        double c = 3;

        System.out.println("The value of the function is: " + findValueOfFunction(a, b, c));
    }

    private static double findValueOfFunction(double a, double b, double c) {

        return ((b + (Math.sqrt((Math.pow(b, 2)) + 4 * a * c))) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
    }
}
