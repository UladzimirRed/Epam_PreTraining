package by.epam.pretraining.task4.aggregation_and_composition.exercise5.logic;

import by.epam.pretraining.task4.aggregation_and_composition.exercise5.entity.*;

import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class TourSelector {
    public static List<Tour> selectToursByPurpose(Agency agency, Purpose purpose) {

        List<Tour> tours = new ArrayList<>();

        for (Tour tour : agency.getTours()) {
            if (tour.getPurpose() == purpose) {
                tours.add(tour);
            }
        }

        return tours;
    }

    public static List<Tour> selectByOptions(Agency agency, Food food, Transport transport, int duration) {

        List<Tour> tours = new ArrayList<>();

        for (Tour tour : agency.getTours()) {
            if (tour.getFood() == food && tour.getTransport() == transport
                    && tour.getDuration().equals(Period.ofDays(duration))) {
                tours.add(tour);
            }
        }

        return tours;
    }
}
