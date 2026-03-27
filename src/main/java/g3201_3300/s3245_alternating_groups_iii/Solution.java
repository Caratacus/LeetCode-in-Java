package g3201_3300.s3245_alternating_groups_iii;

// #Hard #Array #Binary_Indexed_Tree #2025_03_14_Time_38_ms_(91.84%)_Space_77.53_MB_(87.76%)

import java.util.BitSet;
import java.util.List;

public class Solution {

    public List<Integer> numberOfAlternatingGroups(int[] colors, int[][] queries) {
        return null;
    }

    private void add(BitSet set, BIT bit, int n, int i) {}

    private void remove(BitSet set, BIT bit, int n, int i) {}

    private void update(BitSet set, BIT bit, int n, int i, int v) {}

    private int getIndex(int index, int mod) {
        return 0;
    }

    private static class BIT {
        int n;
        int[] tree1;
        int[] tree2;

        BIT(int n) {
            this.n = n + 1;
            tree1 = new int[n + 1];
            tree2 = new int[n + 1];
        }

        void update(int size, int v) {
            for (int i = size; i > 0; i -= i & -i) {
                tree1[i] += v;
                tree2[i] += v * size;
            }
        }

        int[] query(int size) {
            int count = 0;
            int sum = 0;
            for (int i = size; i < n; i += i & -i) {
                count += tree1[i];
                sum += tree2[i];
            }
            return new int[] {count, sum};
        }
    }
}
