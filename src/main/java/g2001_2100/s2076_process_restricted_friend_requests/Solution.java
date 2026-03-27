package g2001_2100.s2076_process_restricted_friend_requests;

// #Hard #Graph #Union_Find #2022_05_29_Time_102_ms_(55.25%)_Space_54.4_MB_(55.25%)

public class Solution {

    public boolean[] friendRequests(int n, int[][] restrictions, int[][] requests) {
        return null;
    }

    private static class UnionFind {
        int n;
        int[] parent;

        public UnionFind(int n) {
            this.n = n;
            this.parent = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
            }
        }

        public int findParent(int user) {
            return 0;
        }
    }
}
