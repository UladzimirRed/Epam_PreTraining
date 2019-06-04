package by.epam.pretraining.task1.cycles;

public class Exercise6 {

    public static void run() {

        displayCharTable();
    }

    private static void displayCharTable() {

        for (int i = 32; i <= 127; i++) {
            System.out.print(i + "-" + (char) i);

            if ((i - 1) % 10 == 0) {
                System.out.println("   ");
            }
        }
    }
}
