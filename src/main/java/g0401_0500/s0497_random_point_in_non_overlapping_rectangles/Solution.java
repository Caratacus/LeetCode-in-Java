package g0401_0500.s0497_random_point_in_non_overlapping_rectangles;

// #Medium #Math #Binary_Search #Prefix_Sum #Ordered_Set #Randomized #Reservoir_Sampling
// #2022_07_24_Time_53_ms_(94.83%)_Space_48.9_MB_(85.06%)

import java.util.Random;

@SuppressWarnings("java:S2245")
public class Solution {

    private final int[] weights;
    private final int[][] rects;
    private final Random random;

    public Solution(int[][] rects) {
        this.weights = new int[rects.length];
        this.rects = rects;
        this.random = new Random();
        for (int i = 0; i < rects.length; i++) {
            int[] rect = rects[i];
            int count = (1 + rect[2] - rect[0]) * (1 + rect[3] - rect[1]);
            weights[i] = (i == 0 ? 0 : weights[i - 1]) + count;
        }
    }

    public int[] pick() {
        return null;
    }

    private int findGreaterOrEqual(int target) {
        return 0;
    }

    private int[] getRandomPoint(int idx) {
        return null;
    }
}
