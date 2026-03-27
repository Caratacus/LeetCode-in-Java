package g2901_3000.s2902_count_of_sub_multisets_with_bounded_sum;

// #Hard #Array #Hash_Table #Dynamic_Programming #Sliding_Window
// #2023_12_29_Time_17_ms_(100.00%)_Space_45.4_MB_(59.02%)

import java.util.List;

public class Solution {

    private static final int MOD = 1000000007;
    private static final int MAX = 20001;
    private static final IntMap INT_MAP = new IntMap();

    public int countSubMultisets(List<Integer> nums, int l, int r) {
        return 0;
    }

    private void update(final int[] cnt, final int n, final int count, final int sum) {}

    private static final class IntMap {
        final int[] map = new int[MAX];
        final int[] vals = new int[MAX];
        int size = 0;

        void add(int v) {
            if (map[v]++ == 0) {
                vals[size++] = v;
            }
        }

        void clear() {
            for (int i = 0; i < size; i++) {
                map[vals[i]] = 0;
            }
            size = 0;
        }
    }
}
