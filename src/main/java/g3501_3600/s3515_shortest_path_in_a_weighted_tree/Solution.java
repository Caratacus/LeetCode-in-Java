package g3501_3600.s3515_shortest_path_in_a_weighted_tree;

// #Hard #Array #Depth_First_Search #Tree #Segment_Tree #Binary_Indexed_Tree
// #2025_04_29_Time_28_ms_(99.55%)_Space_98.56_MB_(99.77%)

@SuppressWarnings("unchecked")
public class Solution {

    public int[] treeQueries(int n, int[][] edges, int[][] queries) {
        return null;
    }

    private static class Edge {
        int to;
        int w;
        int idx;

        Edge(int to, int w, int idx) {
            this.to = to;
            this.w = w;
            this.idx = idx;
        }
    }

    private static class Fenwick {
        int n;
        int[] f;

        Fenwick(int n) {
            this.n = n;
            f = new int[n];
        }

        void update(int i, int v) {
            for (; i < n; i += i & -i) {
                f[i] += v;
            }
        }

        void rangeAdd(int l, int r, int v) {
            update(l, v);
            update(r + 1, -v);
        }

        int pointQuery(int i) {
            int s = 0;
            for (; i > 0; i -= i & -i) {
                s += f[i];
            }
            return s;
        }
    }
}
