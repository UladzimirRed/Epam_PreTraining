package by.epam.pretraining.entity;

import java.util.Objects;
import java.util.Random;

public class Gold implements Comparable<Gold> {
    private static short hiddenNumber = 1;
    private short number = hiddenNumber;
    private int cost;

    {
        hiddenNumber += 1;
        Random random = new Random();
        cost = random.nextInt(100);
    }

    public short getNumber() {
        return number;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gold gold = (Gold) o;
        return number == gold.number &&
                cost == gold.cost;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, cost);
    }

    @Override
    public String toString() {
        return "Gold " + number +
                ": cost=" + cost;
    }

    @Override
    public int compareTo(Gold g) {
        return this.cost - g.cost;
    }
}
