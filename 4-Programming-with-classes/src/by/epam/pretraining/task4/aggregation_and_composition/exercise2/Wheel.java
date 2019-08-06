package by.epam.pretraining.task4.aggregation_and_composition.exercise2;

public class Wheel {
    private int radius;

    public Wheel(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Wheel{" + "radius=" + radius + '}';
    }
}
