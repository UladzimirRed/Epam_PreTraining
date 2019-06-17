package by.epam.pretraining.task1.linear;

public class Exercise6 {

    public static void run() {

        int x = -4;
        int y = -1;

        System.out.println(checkCoordinates(x, y));

    }

    private static boolean checkCoordinates(int x, int y) {

        boolean upperResult, lowerResult;
        boolean a = y >= 0 && y <= 4;
        boolean b = x >= -2 && x <= 2;
        upperResult = a && b;

        boolean c = y >= -3 && y <= 0;
        boolean d = x >= -4 && x <= 4;
        lowerResult = c && d;

        return upperResult || lowerResult;
    }
}
