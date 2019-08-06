package by.epam.pretraining.task5.exercise3;

import java.util.Scanner;

public class Calendar {
    public Info info;
    public String month;

    public Calendar(String month) {
        this.month = month;
        info = new Info();
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public class Info {
        int numberOfHolidays;
        int numberOfWeekdays;

        Scanner scanner = new Scanner(System.in);

        public Info() {
            System.out.println("Enter Number of holidays::");
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Enter integer");
            }
            numberOfHolidays = scanner.nextInt();
            System.out.println("Enter number of weekdays");
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Please enter integer");
            }
            numberOfWeekdays = scanner.nextInt();
        }

        public int getNumberOfHolidays() {
            return numberOfHolidays;
        }

        public void setNumberOfHolidays(int numberOfHolidays) {
            this.numberOfHolidays = numberOfHolidays;
        }

        public int getNumberOfWeekdays() {
            return numberOfWeekdays;
        }

        public void setNumberOfWeekdays(int numberOfWeekdays) {
            this.numberOfWeekdays = numberOfWeekdays;
        }

        public void printCalendar() {
            System.out.println("In " + getMonth() + " number of holidays: " + getNumberOfHolidays()
                    + ", and number of weekdays: " + getNumberOfWeekdays());
        }
    }
}
