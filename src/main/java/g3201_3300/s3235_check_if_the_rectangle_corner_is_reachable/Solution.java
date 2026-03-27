package g3201_3300.s3235_check_if_the_rectangle_corner_is_reachable;

// #Hard #Array #Math #Depth_First_Search #Breadth_First_Search #Union_Find #Geometry
// #2024_08_02_Time_95_ms_(59.46%)_Space_44.8_MB_(94.44%)

import java.util.Arrays;

@SuppressWarnings("java:S135")
public class Solution {

    public boolean canReachCorner(int x, int y, int[][] circles) {
        return false;
    }

    private static class DisjointSet {
        private final int[] parent;
        private final int[] size;

        public DisjointSet(int n) {
            size = new int[n + 1];
            Arrays.fill(size, 1);
            parent = new int[n + 1];
            for (int i = 0; i <= n; i++) {
                parent[i] = i;
            }
        }

        public int findUpar(int u) {
            return 0;
        }

        public void dsu(int u, int v) {}
    }
}
