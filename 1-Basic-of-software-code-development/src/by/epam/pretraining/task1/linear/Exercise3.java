package by.epam.pretraining.task1.linear;

/*
 * Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 * (𝑠𝑖𝑛𝑥 + 𝑐𝑜𝑠𝑦) / (𝑐𝑜𝑠𝑥 − 𝑠𝑖𝑛𝑦) *  𝑡𝑔 𝑥𝑦
 */

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
