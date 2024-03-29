package by.epam.pretraining.task4.aggregation_and_composition.exercise2;

public class Engine {
    private int power;
    private double volume;

    public Engine(int power, double volume) {
        this.power = power;
        this.volume = volume;
    }

    public int getPower() {
        return power;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Engine{" + "power=" + power + ", volume=" + volume + '}';
    }
}
