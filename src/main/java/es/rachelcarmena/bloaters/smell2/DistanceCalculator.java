package es.rachelcarmena.bloaters.smell2;

public class DistanceCalculator {
    public double betweenPoints(Point point1, Point point2) {
        return Math.sqrt(Math.pow((point2.x() - point1.y()), 2) + Math.pow(point2.x() - point1.x(), 2));
    }

    public double toOriginFrom(int x, int y) {
        return Math.sqrt(Math.pow(y, 2) + Math.pow(x, 2));
    }
}
