package by.epam.pretraining.task5.exercise4.controller;

import java.util.Scanner;

/**
 * Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона.
 * Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища
 * и выбора сокровищ на заданную сумму.
 */

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        boolean isExecute = true;

        while (isExecute) {
            System.out.println("What should be done? \n" +
                    "1. Show the whole cave - 1 \n" +
                    "2. Sort the cavern by gold - 2 \n" +
                    "3. Get the most expensive gold - 3 \n" +
                    "4. Get gold in the amount of - 4 \n" +
                    "5. Leave the cavern - 5");
            Scanner scanner = new Scanner(System.in);
            while (!scanner.hasNextByte()) {
                scanner.next();
                System.out.println("Enter integer number");
            }
            byte choice = scanner.nextByte();
            switch (choice) {
                case 1:
                    controller.printGold();
                    break;
                case 2:
                    controller.sortByCost();
                    controller.printGold();
                    break;
                case 3:
                    controller.getMostExpensiveGold();
                    break;
                case 4:
                    System.out.println("Enter the required sum: ");
                    while (!scanner.hasNextInt()) {
                        scanner.next();
                        System.out.println("Enter integer");
                    }
                    int sum = scanner.nextInt();
                    controller.getGoldBySum(sum);
                    break;
                case 5:
                    isExecute = false;
                    System.out.println("See you later");
                    break;
                default:
                    System.out.println("Wrong command!!!\n");
            }
        }
    }
}
