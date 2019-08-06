package by.epam.pretraining.task4.simplest_classes_and_objects.exercise10;

import java.time.LocalTime;

/**
 * 9. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод
 * toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами. Задать
 * критерии выбора данных и вывести эти данные на консоль.
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * Найти и вывести:
 * а) список рейсов для заданного пункта назначения;
 * б) список рейсов для заданного дня недели;
 * в) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

public class Airline {
    private String destination;
    private String flightNumber;
    private String planeType;
    private LocalTime departureTime;
    private DayOfTheWeek dayOfTheWeek;

    public Airline(String destination, String flightNumber, String planeType, LocalTime departureTime, DayOfTheWeek dayOfTheWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.planeType = planeType;
        this.departureTime = departureTime;
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public DayOfTheWeek getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public void setDayOfTheWeek(DayOfTheWeek dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "Destination='" + destination + '\'' +
                ", Flight number='" + flightNumber + '\'' +
                ", Type of plane='" + planeType + '\'' +
                ", Departure Time=" + departureTime +
                ", Day Of The Week=" + dayOfTheWeek +
                '}';
    }
}
