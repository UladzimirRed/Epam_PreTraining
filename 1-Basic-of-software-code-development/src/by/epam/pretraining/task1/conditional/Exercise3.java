package by.epam.pretraining.task1.conditional;

/*
 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 */

public class Exercise3 {

    public static void run() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 2;
        int y2 = 0;
        int x3 = -1;
        int y3 = 3;

        System.out.println("The points are located on one straight line. It is " + arePointsOnOneLine(x1, y1, x2, y2, x3, y3));
    }

    private static boolean arePointsOnOneLine(int x1, int y1, int x2, int y2, int x3, int y3) {
        int k = (y1 - y2) / (x1 - x2);
        int b = y2 - k * x2;
        int y4 = k * x3 + b;

        return y4 == y3;
    }
}
