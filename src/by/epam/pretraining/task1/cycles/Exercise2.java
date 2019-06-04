package by.epam.pretraining.task1.cycles;

public class Exercise2 {

    public static void run() {

        double a = 1.5;
        double b = 3.0;
        double h = 0.5;

        findValueOfFunction(a, b, h);
    }

    private static void findValueOfFunction(double a, double b, double h) {

        double result;
        do {
            if (a > 2) {
                result = a;
            } else result = -a;

            System.out.println(a + ": " + result);
        }

        while ((a += h) <= b);
    }
}
