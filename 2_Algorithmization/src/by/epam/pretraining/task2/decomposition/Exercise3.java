package by.epam.pretraining.task2.decomposition;

/**
 * Вычислить площадь правильного шестиугольника со стороной а, используя метод
 * вычисления площади треугольника.
 */

import java.util.Scanner;

public class Exercise3 {

    private static int side;
    private static double hexagonArea;

    public static void run(){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the side of the triangle");
        while (!scanner.hasNextInt() || (side = scanner.nextInt()) <= 0) {
            scanner.nextLine();
            System.out.println("Please enter POSITIVE INTEGER number");
        }
        hexagonArea = calculateHexagonArea(side);
        System.out.println("The area of hexagon with side " + side + " is: " + hexagonArea);
    }

    private static double calculateTriangleArea (double side){
        return Math.sqrt(3) * side * side / 4;
    }

    private static double calculateHexagonArea (double side){
        return calculateTriangleArea(side) * 6;
    }
}
