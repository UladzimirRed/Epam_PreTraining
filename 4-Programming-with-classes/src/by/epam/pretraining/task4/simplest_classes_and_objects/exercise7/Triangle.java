package by.epam.pretraining.task4.simplest_classes_and_objects.exercise7;

/**
 * Описать класс, представляющий треугольник.
 * Предусмотреть методы для создания объектов, вычисления
 * площади, периметра и точки пересечения медиан.
 */

import static by.epam.pretraining.task4.simplest_classes_and_objects.exercise7.Point.findDistance;

public class Triangle {
    Point pointA;
    Point pointB;
    Point pointC;

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }


    public double findSquare() {
        double p = findPerimeter() / 2;
        return Math.sqrt(p * (p - findDistance(pointB, pointA)) *
                (p - findDistance(pointC, pointB)) *
                (p - findDistance(pointA, pointC)));
    }

    public double findPerimeter() {
        return findDistance(pointB, pointA) + findDistance(pointC, pointB) + findDistance(pointA, pointC);
    }

    public Point getMedian() {
        return new Point((pointA.getX() + pointB.getX() + pointC.getX()) / 3,
                (pointA.getY() + pointB.getY() + pointC.getY()) / 3);
    }

    public void getPoints() {
        System.out.println(pointA.getX() + " " + pointA.getY());
        System.out.println(pointB.getX() + " " + pointB.getY());
        System.out.println(pointC.getX() + " " + pointC.getY());
    }
}

