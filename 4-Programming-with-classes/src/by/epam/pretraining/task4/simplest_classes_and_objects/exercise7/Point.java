package by.epam.pretraining.task4.simplest_classes_and_objects.exercise7;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static double findDistance(Point pointX, Point pointY) {

        return Math.sqrt((pointX.getX() - pointY.getX()) * (pointX.getX() - pointY.getX()) +
                (pointX.getY() - pointY.getY()) * (pointX.getY() - pointY.getY()));
    }
}
