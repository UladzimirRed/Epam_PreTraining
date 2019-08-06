package by.epam.pretraining.task4.simplest_classes_and_objects.exercise2;

/**
 * Создйте класс Test2 двумя переменными. Добавьте конструктор с входными
 * параметрами. Добавьте конструктор, инициализирующий члены класса по
 * умолчанию. Добавьте set- и get- методы для полей экземпляра класса.
 */

public class Test2 {
    private int a;
    private int b;

    public Test2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Test2() {
        this.a = 1;
        this.b = 2;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static void main(String[] args) {
        Test2 test = new Test2(10, 20);
        Test2 defaultTest = new Test2();

        System.out.println("Initialization with input parameters: " + test.getA() + ", " + test.getB());
        System.out.println("Initialization with default parameters: " + defaultTest.getA() + ", " + defaultTest.getB());

        test.setA(100);
        test.setB(200);

        System.out.println("After changing the parameters:");
        System.out.println("Initialization with input parameters: " + test.getA() + ", " + test.getB());
    }
}
