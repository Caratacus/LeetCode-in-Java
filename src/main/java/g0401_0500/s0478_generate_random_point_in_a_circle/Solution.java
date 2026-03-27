package g0401_0500.s0478_generate_random_point_in_a_circle;

// #Medium #Math #Geometry #Randomized #Rejection_Sampling
// #2022_07_20_Time_342_ms_(56.21%)_Space_128_MB_(45.56%)

import java.util.Random;

@SuppressWarnings("java:S2245")
public class Solution {

    private final double radius;
    private final double xCenter;
    private final double yCenter;
    private final Random random = new Random();

    public Solution(double radius, double xCenter, double yCenter) {
        this.radius = radius;
        this.xCenter = xCenter;
        this.yCenter = yCenter;
    }

    public double[] randPoint() {
        return null;
    }

    private double getDistance(double x, double y) {
        return 0.0;
    }

    private double getCoordinate(double center) {
        return 0.0;
    }
}
