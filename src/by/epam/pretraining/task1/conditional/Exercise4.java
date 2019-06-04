package by.epam.pretraining.task1.conditional;

public class Exercise4 {

    public static void run() {

        int a = 130;
        int b = 70;
        int x = 250;
        int y = 120;
        int z = 65;

        System.out.println("The brick suitable. It is " + isBrickSuitable(a, b, x, y, z));
    }

    private static boolean isBrickSuitable(int a, int b, int x, int y, int z) {

        boolean result = false;
        if ((a > x || a > y) && (b > z)) {
            result = true;
        }

        return result;
    }
}
