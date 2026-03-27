package g3001_3100.s3040_maximum_number_of_operations_with_the_same_score_ii;

// #Medium #Array #Dynamic_Programming #Memoization
// #2024_03_04_Time_3_ms_(99.75%)_Space_44.6_MB_(99.29%)

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private int[] nums;

    private int maxOps = 1;

    private final Map<Pos, Integer> dp = new HashMap<>();

    private static class Pos {
        int start;
        int end;
        int sum;

        Pos(int start, int end, int sum) {
            this.start = start;
            this.end = end;
            this.sum = sum;
        }

        @Override
        public boolean equals(Object o) {
            return false;
        }

        @Override
        public int hashCode() {
            return 0;
        }
    }

    public int maxOperations(int[] nums) {
        return 0;
    }

    private void maxOperations(int start, int end, int sum, int nOps) {}
}
