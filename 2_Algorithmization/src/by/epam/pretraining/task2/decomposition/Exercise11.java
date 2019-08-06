package by.epam.pretraining.task2.decomposition;

/**
 *  Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */

public class Exercise11 {

    public static void run() {
        System.out.println(countNumberOfdigit(123, -321));
        System.out.println(countNumberOfdigit(-4444, 333));
        System.out.println(countNumberOfdigit(-1, 22));
    }

    private static String countNumberOfdigit(int firstNumber, int secondNumber) {
        int firstCount = (int) (Math.log10(Math.abs(firstNumber)) + 1);
        int secondCount = (int) (Math.log10(Math.abs(secondNumber)) + 1);
        System.out.print("Number of digits: " + firstCount + " vs " + secondCount + " -----> ");
        if (firstCount == secondCount) {
            return "The length of the numbers is the same.";
        } else {
            return (firstCount > secondCount) ? ("The first is longer") : ("The second is longer");
        }
    }
}
