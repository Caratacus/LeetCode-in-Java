package g3601_3700.s3650_minimum_cost_path_with_edge_reversals;

// #Medium #Heap_Priority_Queue #Graph #Shortest_Path #Biweekly_Contest_163
// #2025_09_26_Time_47_ms_(99.80%)_Space_109.50_MB_(56.57%)

@SuppressWarnings({"java:S1210", "java:S2234"})
public class Solution {

    private static final int INF = Integer.MAX_VALUE / 2 - 1;
    private int cnt;
    private int[] head;
    private int[] next;
    private int[] to;
    private int[] weight;

    private static class Dist implements Comparable<Dist> {
        int u;
        int d;

        public Dist(int u, int d) {
            this.u = u;
            this.d = d;
        }

        @Override
        public int compareTo(Dist o) {
            return 0;
        }
    }

    private void init(int n, int m) {}

    private void add(int u, int v, int w) {}

    private int dist(int s, int t, int n) {
        return 0;
    }

    public int minCost(int n, int[][] edges) {
        return 0;
    }
}
