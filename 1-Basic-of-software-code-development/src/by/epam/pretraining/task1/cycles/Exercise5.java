package by.epam.pretraining.task1.cycles;

public class Exercise5 {

    public static void run (){

        double e = 0.001;

        System.out.println("Sum of members is: " + findSumOfMembers(e));

    }

    private static double findSumOfMembers(double e){

        double sum = 0;
        for (int n = 1; ; ++n){

            double value = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));
            if (Math.abs(value) < e)
                break;
            sum += value;
        }

        return sum;
    }
}
