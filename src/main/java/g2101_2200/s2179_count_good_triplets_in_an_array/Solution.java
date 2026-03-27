package g2101_2200.s2179_count_good_triplets_in_an_array;

// #Hard #Array #Binary_Search #Ordered_Set #Divide_and_Conquer #Segment_Tree #Binary_Indexed_Tree
// #Merge_Sort #2022_06_09_Time_16_ms_(92.94%)_Space_78.1_MB_(77.65%)

public class Solution {

    public long goodTriplets(int[] nums1, int[] nums2) {
        return 0L;
    }

    private static class Tree {
        int[] array;
        int n;

        public Tree(int n) {
            this.n = n;
            array = new int[n + 1];
        }

        int lowbit(int x) {
            return x & (-x);
        }

        void update(int i, int delta) {
            while (i <= n) {
                array[i] += delta;
                i += lowbit(i);
            }
        }

        int query(int k) {
            int ans = 0;
            while (k > 0) {
                ans += array[k];
                k -= lowbit(k);
            }
            return ans;
        }
    }
}
