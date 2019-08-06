package by.epam.pretraining.task4.simplest_classes_and_objects.exercise7;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(new Point(1, 2), new Point(2, 4),
                new Point(4, 2));
        Point point;
        point = triangle.getMedian();
        System.out.print("Triangle with points: \n");
        triangle.getPoints();
        System.out.println("Perimeter:");
        System.out.format("%.2f", triangle.findPerimeter());
        System.out.println("\nSquare:");
        System.out.format("%.2f", triangle.findSquare());
        System.out.println("\nMedian crossing point:");
        System.out.format("%.2f", point.getX());
        System.out.print(" : ");
        System.out.format("%.2f", point.getY());

    }
}
