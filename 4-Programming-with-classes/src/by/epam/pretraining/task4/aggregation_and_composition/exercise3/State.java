package by.epam.pretraining.task4.aggregation_and_composition.exercise3;

import java.util.ArrayList;
import java.util.List;

public class State {
    private String name;
    private City capital;
    private List<Region> regions;

    public State(String name, City capital) {
        this.name = name;
        this.capital = capital;
        this.regions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public boolean addRegion(Region region) {
        return regions.add(region);
    }

    public boolean removeRegion(Region region) {
        return regions.remove(region);
    }

    public long getPopulation() {
        long sum = 0;

        for (Region region : regions) {
            sum += region.getPopulation();
        }

        return sum + capital.getPopulation();
    }

    public double getSquare() {
        double total = 0;

        for (Region region : regions) {
            total += region.getSquare();
        }

        return total + capital.getSquare();
    }

    public int getRegionNumber() {
        return regions.size();
    }

    public void getRegionCenters() {
        for (Region region : regions) {
            System.out.println(region.getCenter());
        }
    }

    @Override
    public String toString() {
        return "Country{" + "name='" + name + '\'' + ", capital=" + capital + '}';
    }
}
