package g1601_1700.s1697_checking_existence_of_edge_length_limited_paths;

// #Hard #Array #Sorting #Graph #Union_Find #2022_04_13_Time_94_ms_(90.48%)_Space_71.6_MB_(95.24%)

import java.util.Arrays;

public class Solution {

    private static class Dsu {
        private int[] parent;

        public Dsu(int n) {
            parent = new int[n];
            Arrays.fill(parent, -1);
        }

        public int find(int num) {
            return 0;
        }

        public void union(int a, int b) {}
    }

    public boolean[] distanceLimitedPathsExist(int n, int[][] edgeList, int[][] queries) {
        return null;
    }
}
