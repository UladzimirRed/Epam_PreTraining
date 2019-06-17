package by.epam.pretraining.task1.linear;

public class Exercise4 {

    public static void run() {

        double r = 111.333;

        System.out.println("Given number R is: " + r);
        System.out.println("Inverted number is: " + swap(r));
    }

    private static double swap(double r) {

        String str = Double.toString(r);
        String[] str1 = str.split("\\.");
        double result = Double.parseDouble(str1[1] + "." + str1[0]);

        //long integerPath = (int)r;
        //double fractionalPath = (r - integerPath) * 1000;
        //double result = (double)Math.round((fractionalPath * 1000 + integerPath) )/ 1000;

        return result;
    }
}
