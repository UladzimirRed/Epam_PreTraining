package by.epam.pretraining.task1.cycles;

/*
 * Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */

public class Exercise6 {

    public static void run() {
        displayCharTable();
        System.out.println();
    }

    private static void displayCharTable() {
        for (int i = 32; i <= 127; i++) {
            System.out.print(i + "-" + (char) i + " \t");
            if ((i - 1) % 10 == 0) {
                System.out.println("       ");
            }
        }
    }
}
