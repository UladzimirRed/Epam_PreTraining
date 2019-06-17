package by.epam.pretraining.task1.conditional;

public class Exercise2 {

    public static void run() {

        int a = 90;
        int b = 45;
        int c = 180;
        int d = 122;

        System.out.println("Max value is: " + findMax(a, b, c, d));
    }

    private static int findMax(int a, int b, int c, int d) {

        int minOne = a < b ? a : b;
        int minTwo = c < d ? c : d;

        return minOne < minTwo ? minTwo : minOne;

    }
}
