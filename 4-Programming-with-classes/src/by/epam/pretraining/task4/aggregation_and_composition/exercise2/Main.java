package by.epam.pretraining.task4.aggregation_and_composition.exercise2;

/**
 * 2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться, менять колесо,
 * вывести на консоль марку автомобиля.
 */

public class Main {
    public static void main(String[] args) {

        Engine engine = new Engine(250, 3.0d);

        Car car = new Car("Toyota LandCruiser", engine);

        car.addWheel(new Wheel(20));
        car.addWheel(new Wheel(20));
        car.addWheel(new Wheel(20));
        car.addWheel(new Wheel(20));

        car.printModel();

        car.fuelUp();
        car.changeWheel();
        car.move();

        car.changeWheel();
    }
}
