package by.epam.pretraining.task5.exercise3;

/**
 * Создать класс календарь с внутренним классом, с помощью объектов которого
 * можно хранить информацию о выходных и праздничных днях.
 */

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new Calendar("August");
        calendar.info.printCalendar();
    }
}
