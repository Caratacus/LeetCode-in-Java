package g3301_3400.s3321_find_x_sum_of_all_k_long_subarrays_ii;

// #Hard #Array #Hash_Table #Heap_Priority_Queue #Sliding_Window
// #2024_10_15_Time_410_ms_(94.03%)_Space_66.1_MB_(82.09%)

@SuppressWarnings("java:S1210")
public class Solution {

    private static class RC implements Comparable<RC> {
        int val;
        int cnt;

        RC(int v, int c) {
            val = v;
            cnt = c;
        }

        public int compareTo(RC o) {
            return 0;
        }
    }

    public long[] findXSum(int[] nums, int k, int x) {
        return null;
    }
}
