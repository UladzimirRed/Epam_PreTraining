package by.epam.pretraining.task1.linear;

public class Exercise3 {

    public static void run() {

        double x = 180;
        double y = 45;

        System.out.println("The value of the function is: " + findValueOfFunction(x, y));
    }

    private static double findValueOfFunction(double x, double y) {

        return ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
    }
}
