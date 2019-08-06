package by.epam.pretraining.task4.simplest_classes_and_objects.exercise10;

import java.time.LocalTime;

public class Airport {
    private Airline[] airlines;

    public Airport(Airline[] airlines) {
        this.airlines = airlines;
    }

    public Airline[] getAirlines() {
        return airlines;
    }

    public void setAirlines(Airline[] airlines) {
        this.airlines = airlines;
    }

    public void getAirlinesByDestination(String destination) {
        boolean isDest = false;
        for (Airline airline : airlines) {
            if (airline.getDestination().equalsIgnoreCase(destination.trim())) {
                System.out.println(airline);
                isDest = true;
            }
        }
        if (!isDest) {
            System.out.println("There are no airlines to " + destination + " at the time.");
        }
    }

    public void getAirlinesByDayOfWeek(DayOfTheWeek day) {
        boolean isDay = false;
        for (Airline airline : airlines) {
            if (airline.getDayOfTheWeek().name().equalsIgnoreCase(day.name())) {
                System.out.println(airline);
                isDay = true;
            }
        }
        if (!isDay) {
            System.out.println("There are no airlines on " + day);
        }
    }

    public void getAirlinesByDayTime(DayOfTheWeek day, LocalTime time) {
        boolean isTime = false;
        for (Airline airline : airlines) {
            if (airline.getDayOfTheWeek().name().equalsIgnoreCase(day.name())) {
                if (airline.getDepartureTime().compareTo(time) > 0) {
                    System.out.println(airline);
                    isTime = true;
                }
            }
        }
        if (!isTime) {
            System.out.println("There are no airlines on " + day + " after " + time);
        }
    }

    public void printAirlines() {
        for (Airline airline : airlines) {
            System.out.println(airline);
        }
    }
}
