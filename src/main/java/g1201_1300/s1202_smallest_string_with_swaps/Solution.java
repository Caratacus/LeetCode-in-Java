package g1201_1300.s1202_smallest_string_with_swaps;

// #Medium #String #Hash_Table #Depth_First_Search #Breadth_First_Search #Union_Find
// #2022_03_08_Time_43_ms_(86.82%)_Space_94.1_MB_(64.69%)

import java.util.List;

public class Solution {

    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        return null;
    }

    static class UF {
        int[] root;
        int[] rank;

        UF(int n) {
            root = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) {
                root[i] = i;
                rank[i] = 1;
            }
        }

        int find(int u) {
            if (u == root[u]) {
                return u;
            }

            root[u] = find(root[u]);
            return root[u];
        }

        void union(int u, int v) {
            int ru = find(root[u]);
            int rv = find(root[v]);
            if (ru != rv) {
                if (rank[ru] < rank[rv]) {
                    root[ru] = root[rv];
                } else if (rank[ru] > rank[rv]) {
                    root[rv] = root[ru];
                } else {
                    root[rv] = root[ru];
                    rank[ru]++;
                }
            }
        }
    }
}
