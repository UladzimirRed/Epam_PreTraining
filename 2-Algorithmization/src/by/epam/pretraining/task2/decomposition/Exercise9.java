package by.epam.pretraining.task2.decomposition;

/**
 * Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы)
 * вычисления его площади, если угол между сторонами длиной X и Y— прямой.
 */

public class Exercise9 {

    private static double quadrilateral;
    private static int x = 3, y = 7, z = 3, t = 5;

    public static void run() {
        quadrilateral = (float) calculateSquareOfQuadrilateral(x, y, z, t);
        System.out.println("Area of a quadrilateral with sides x="
                + x + ", y=" + y + ", z=" + z + ", t=" + t + " is: " + quadrilateral);
    }

    private static double calculateSquareOfQuadrilateral(double x, double y, double z, double t) {
        //находим сторону треугольник по теореме Пифагора
        double diagonal = Math.sqrt(x * x + y * y);
        //площадь первого треугольника
        double s1 = x * y / 2;

        //площадь второго треугольника по формуле Герона
        double p = (diagonal + z + t) / 2;
        double s2 = Math.sqrt(p * (p - diagonal) * (p - z) * (p - t));

        return s1 + s2;
    }
}
