package g2001_2100.s2092_find_all_people_with_secret;

// #Hard #Sorting #Depth_First_Search #Breadth_First_Search #Graph #Union_Find
// #2022_05_27_Time_95_ms_(84.86%)_Space_99.7_MB_(87.33%)

import java.util.List;

public class Solution {

    public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
        return null;
    }

    // regular union find
    private static class UF {
        private int[] parent;
        private int[] rank;

        public UF(int n) {
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public void union(int p, int q) {}

        public int find(int p) {
            return 0;
        }

        public boolean connected(int p, int q) {
            return false;
        }

        public void reset(int p) {}
    }
}
