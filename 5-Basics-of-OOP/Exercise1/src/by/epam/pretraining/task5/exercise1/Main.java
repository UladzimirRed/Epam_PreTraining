package by.epam.pretraining.task5.exercise1;

/**
 * Создать объект Текстового файла, используя классы Текст, Директория.
 * Методы: создать, переименовать, вывести на консоль содержимое, дополнить,удалить.
 */

public class Main {

    public static void main(String[] args) {
        Directory directory = new Directory();
        Text text = new Text();
        text.createText("July 19, 2019: \n" +
                "50 years from the day of landing on the moon. ");
        text.printText();
        text.refactorText();
        System.out.println("\nRefactored text: ");
        text.printText();
        directory.renameDirectory();
        directory.deleteDirectory();
    }
}
