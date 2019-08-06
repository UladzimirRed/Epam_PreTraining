package by.epam.pretraining.task4.simplest_classes_and_objects.exercise10;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Airline[] airlines = {new Airline("Minsk", "BY 4434", "Airbus 319",
                LocalTime.of(18, 30), DayOfTheWeek.MONDEY),
                new Airline("Moscow", "RU 3255", "SSJ 420",
                        LocalTime.of(22, 15), DayOfTheWeek.THURSDAY),
                new Airline("New-York", "US 7536", "Boing 747",
                        LocalTime.of(2, 30), DayOfTheWeek.MONDEY),
                new Airline("Vilnius", "LT 9952", "Airbus 321",
                        LocalTime.of(21, 45), DayOfTheWeek.FRIDAY),
                new Airline("New-York", "US 7711", "Airbus 319",
                        LocalTime.of(18, 0), DayOfTheWeek.SATURDAY),
                new Airline("Moscow", "RU 4321", "Boing 740",
                        LocalTime.of(20, 25), DayOfTheWeek.MONDEY),
                new Airline("Hrodno", "BY 6633", "Airbus 320",
                        LocalTime.of(9, 30), DayOfTheWeek.WEDNESDAY)};

        Airport airPort = new Airport(airlines);
        airPort.printAirlines();
        System.out.println("\nFlight list for a given destination: ");
        airPort.getAirlinesByDestination("Moscow");
        System.out.println("\nList of flights for a given day of the week: ");
        airPort.getAirlinesByDayOfWeek(DayOfTheWeek.MONDEY);
        System.out.println("\nList of flights for a given day of the week, the departure time for which is longer than the specified one: ");
        airPort.getAirlinesByDayTime(DayOfTheWeek.MONDEY, LocalTime.of(12, 0));
    }
}

