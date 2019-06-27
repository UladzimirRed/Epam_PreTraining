package by.epam.pretraining.task1.linear;

/*
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
 * Поменять местами дробную и целую части числа и вывести полученное значение числа.
 */

public class Exercise4 {

    public static void run() {
        double r = 111.333;

        System.out.println("Given number R is: " + r);
        System.out.println("Inverted number is: " + swap(r));
    }

    private static double swap(double r) {
        int integerPath = (int)r;
        double fractionalPath = (r - integerPath) * 1000;
        double result = (double)Math.round((fractionalPath * 1000 + integerPath) )/ 1000;

        return result;
    }
}
