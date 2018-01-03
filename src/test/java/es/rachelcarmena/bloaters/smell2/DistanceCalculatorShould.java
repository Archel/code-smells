package es.rachelcarmena.bloaters.smell2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DistanceCalculatorShould {
    private DistanceCalculator distanceCalculator;
    private Point from;
    private Point to;

    @Before
    public void setUp() {
        distanceCalculator = new DistanceCalculator();
        from = new Point(1, 5);
        to = new Point(2, 8);
    }

    @Test
    public void calculate_distance_between_points() {
        double distance = distanceCalculator.betweenPoints(from, to);

        assertEquals(3.16, distance, 0.01);
    }

    @Test
    public void calculate_distance_from_one_point_to_origin() {
        double distance = distanceCalculator.toOriginFrom(from);

        assertEquals(5.1, distance, 0.01);
    }
}
