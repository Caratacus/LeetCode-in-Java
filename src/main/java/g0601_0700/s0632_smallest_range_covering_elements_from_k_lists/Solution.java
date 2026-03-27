package g0601_0700.s0632_smallest_range_covering_elements_from_k_lists;

// #Hard #Array #Hash_Table #Sorting #Greedy #Heap_Priority_Queue #Sliding_Window
// #2022_03_21_Time_31_ms_(87.39%)_Space_57.6_MB_(18.58%)

import java.util.List;

public class Solution {

    @SuppressWarnings("java:S1210")
    static class Triplet implements Comparable<Triplet> {
        int value;
        int row;
        int idx;

        Triplet(int value, int row, int idx) {
            this.value = value;
            this.row = row;
            this.idx = idx;
        }

        public int compareTo(Triplet obj) {
            return 0;
        }
    }

    public int[] smallestRange(List<List<Integer>> nums) {
        return null;
    }
}
