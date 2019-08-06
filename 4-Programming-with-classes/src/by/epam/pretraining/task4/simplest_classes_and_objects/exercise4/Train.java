package by.epam.pretraining.task4.simplest_classes_and_objects.exercise4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

/**
 * Создайте класс Train, содержащий поля: название пункта назначения, номер
 * поезда, время отправления. Создайте данные в массив из пяти элементов типа
 * Train, добавьте возможность сортировки элементов массива по номерам поездов.
 * Добавьте возможность вывода информации о поезде, номер которого введен поль-
 * зователем. Добавьте возможность сортировки массив по пункту назначения, при-
 * чем поезда с одинаковыми пунктами назначения должны быть упорядочены по вре-
 * мени отправления.
 */

public class Train {
    private String destination;
    private String trainNumber;
    private Date departureTime;
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");

    private Train(String destination, String trainNumber, Date departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    private static void sortTrainNumber(Train[] trains) {
        Train temp;
        for (int i = 0; i < trains.length; i++) {
            for (int j = trains.length - 1; j > i; j--) {
                if (trains[i].trainNumber.compareTo(trains[j].trainNumber) > 0) {
                    temp = trains[i];
                    trains[i] = trains[j];
                    trains[j] = temp;
                }
            }
        }
    }

    private static void sortTrainDestination(Train[] trains) {
        Train temp;
        for (int i = 0; i < trains.length; i++) {
            for (int j = trains.length - 1; j > i; j--) {
                int compare = trains[i].destination.compareTo(trains[j].destination);
                if (compare > 0) {
                    temp = trains[i];
                    trains[i] = trains[j];
                    trains[j] = temp;
                } else if (compare == 0) {
                    if (trains[i].departureTime.compareTo(trains[j].departureTime) > 0) {
                        temp = trains[i];
                        trains[i] = trains[j];
                        trains[j] = temp;
                    }
                }
            }
        }
    }

    private static String printTrainInformation(Train[] trains, String trainNumber) {

        for (Train train : trains) {
            if (train.trainNumber.equalsIgnoreCase(trainNumber)) {
                return "destination: " + train.destination +
                        ", departure time: " + dateFormat.format(train.departureTime);
            }
        }
        return null;
    }

    public static void main(String[] args) throws ParseException {
        Train[] trains = new Train[5];
        trains[0] = new Train("Minsk", "626B", dateFormat.parse("18:58"));
        trains[1] = new Train("Grodno", "612B", dateFormat.parse("11:48"));
        trains[2] = new Train("Vilnus", "092K", dateFormat.parse("13:50"));
        trains[3] = new Train("Grodno", "116H", dateFormat.parse("15:40"));
        trains[4] = new Train("Kiev", "864H", dateFormat.parse("05:40"));

        sortTrainNumber(trains);
        System.out.println("Sorting by numbers:");
        for (Train train : trains) {
            System.out.println(train.trainNumber);
        }

        System.out.println("\nOutput of train information:");
        String request = "626B";
        System.out.printf("Train #%s, ", request);
        System.out.println(printTrainInformation(trains, request) + "\n");

        sortTrainDestination(trains);
        System.out.println("Sorting trains by destination:");
        for (Train train : trains) {
            System.out.println(train.destination + " " + train.trainNumber + " - " + dateFormat.format(train.departureTime));
        }
    }

}
