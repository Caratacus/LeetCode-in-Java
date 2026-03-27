package g2801_2900.s2869_minimum_operations_to_collect_elements;

// #Easy #Array #Hash_Table #2023_12_21_Time_1_ms_(100.00%)_Space_42.4_MB_(5.72%)

import java.util.List;

public class Solution {

    public int minOperations(List<Integer> nums, int k) {
        return 0;
    }

    private static class Pair {
        boolean isVisited;
        int totalVisitedTillNow;

        public Pair(boolean isVisited, int totalVisitedTillNow) {
            this.isVisited = isVisited;
            this.totalVisitedTillNow = totalVisitedTillNow;
        }
    }
}
