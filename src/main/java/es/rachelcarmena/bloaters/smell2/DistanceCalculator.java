package es.rachelcarmena.bloaters.smell2;

public class DistanceCalculator {
    public double betweenPoints(Point from, Point to) {
        return Math.sqrt(Math.pow((to.x() - from.y()), 2) + Math.pow(to.x() - from.x(), 2));
    }

    public double toOriginFrom(Point point) {
        return Math.sqrt(Math.pow(point.y(), 2) + Math.pow(point.x(), 2));
    }
}
