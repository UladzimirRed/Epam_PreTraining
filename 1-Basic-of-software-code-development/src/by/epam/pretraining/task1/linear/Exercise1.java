package by.epam.pretraining.task1.linear;

/*
Найдите  значение функции: z = ( (a – 3 ) * b / 2) + c.
 */

public class Exercise1 {

    public static void run() {
        double a = 5;
        double b = 12;
        double c = 3;

        System.out.println("The value of the function is: " + findValueOfFunction(a, b, c));
    }

    private static double findValueOfFunction(double a, double b, double c) {
        return ((a - 3) * b / 2) + c;
    }
}
