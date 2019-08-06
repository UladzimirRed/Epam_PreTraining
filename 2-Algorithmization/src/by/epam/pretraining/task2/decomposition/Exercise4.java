package by.epam.pretraining.task2.decomposition;

/**
 * На плоскости заданы своими координатами n точек. Написать метод(методы),
 * определяющие, между какими из пар точек самое большое расстояние.
 * Указание. Координаты точек занести в массив.
 */

public class Exercise4 {

    private static double maxDistance;
    private static int[]result;
    public static void run() {
        int[][] points = initialPoints();
        result = findPointsWithMaxDistance(points);
        System.out.printf("Max distance between points %d ans %d: %f.%n", result[0], result[1], maxDistance);

    }

    private static int[][] initialPoints() {
        return new int[][]{{1, 6}, {4, 2}, {11, 1}, {-8, 7}, {-3, -9},
                {0, 13}, {3, 16}, {-4, 14}};
    }

    private static double calculateDistance(int[][] points) {
        return Math.sqrt(Math.pow((points[0][0] - points[1][0]), 2) + Math.pow((points[0][1] - points[1][1]), 2));
    }

    private static int[] findPointsWithMaxDistance(int[][] points) {
        result = new int[2];
        double distance;
        maxDistance = 0;
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                int[][] currentPoints = {{points[i][0], points[i][1]}, {points[j][0], points[j][1]}};
                distance = calculateDistance(currentPoints);
                if (distance > maxDistance) {
                    maxDistance = distance;
                    result[0] = i + 1;
                    result[1] = j + 1;
                }
            }
        }
        return result;
    }
}
