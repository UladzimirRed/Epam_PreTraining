package by.epam.pretraining.task1.conditional;

/*
 * Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
 * и если да, то будет ли он прямоугольным.
 */

public class Exercise1 {

    public static void run() {
        int alfa = 90;
        int beta = 45;
        int gamma = 180 - alfa - beta;

        System.out.println("Does the triangle exist: " + isExists(gamma));
        System.out.println("Is it the right triangle" + isRightTriangle(alfa, beta, gamma));
    }


    private static boolean isRightTriangle(int alfa, int beta, int gamma) {
        if (isExists(gamma)) {
            return  gamma == 90 || alfa == 90 || beta == 90;
        }
        return false;
    }

    private static boolean isExists(int gamma) {
        return gamma > 0;
    }
}
