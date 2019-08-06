package by.epam.pretraining.task4.simplest_classes_and_objects.exercise1;

/**
 * Создайте класс Test1 c двумя переменными. Добавьте метод вывода на экран и
 * методы изменения этих переменных. Добавьте метод, который находит сумму
 * значений этих переменных, и метод, который находит наибольшее значение
 * из этих двух переменных.
 */

public class Test1 {
    private int a = 1;
    private int b = 2;

    public void printVariable() {
        System.out.printf("First variable: %d, Second variable: %d", a, b);
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getSum() {
        return a + b;
    }

    public int getMaxValue() {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println("Task 1.1");

        Test1 test = new Test1();

        test.printVariable();
        System.out.println("\nSum of variables: " + test.getSum());
        System.out.println("Max value: " + test.getMaxValue());

        System.out.println("Change the value of variables:");
        test.setA(10);
        test.setB(20);

        test.printVariable();
        System.out.println("\nSum of variables: " + test.getSum());
        System.out.println("Max value: " + test.getMaxValue());
        System.out.println("____________________");
    }
}
