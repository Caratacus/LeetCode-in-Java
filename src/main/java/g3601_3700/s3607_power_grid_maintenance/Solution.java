package g3601_3700.s3607_power_grid_maintenance;

// #Medium #Array #Hash_Table #Depth_First_Search #Breadth_First_Search #Heap_Priority_Queue #Graph
// #Union_Find #Ordered_Set #2025_07_08_Time_84_ms_(94.64%)_Space_131.60_MB_(76.86%)

import java.util.PriorityQueue;

@SuppressWarnings("unchecked")
public class Solution {

    private static class UF {
        int[] par;
        PriorityQueue<Integer>[] pq;
        boolean[] active;

        UF(int n) {
            par = new int[n];
            pq = new PriorityQueue[n];
            active = new boolean[n];
            for (int i = 0; i < n; i++) {
                active[i] = true;
                par[i] = i;
                pq[i] = new PriorityQueue<>();
                pq[i].add(i);
            }
        }

        int find(int u) {
            if (par[u] == u) {
                return u;
            }
            par[u] = find(par[u]);
            return par[u];
        }

        void union(int u, int v) {
            int pu = find(u);
            int pv = find(v);
            if (pu == pv) {
                return;
            }
            if (pq[pu].size() > pq[pv].size()) {
                while (!pq[pv].isEmpty()) {
                    pq[pu].add(pq[pv].poll());
                }
                par[pv] = par[pu];
            } else {
                while (!pq[pu].isEmpty()) {
                    pq[pv].add(pq[pu].poll());
                }
                par[pu] = par[pv];
            }
        }

        void inactive(int u) {
            active[u] = false;
        }

        int check(int u) {
            if (active[u]) {
                return u;
            }
            int pu = find(u);
            while (!pq[pu].isEmpty() && !active[pq[pu].peek()]) {
                pq[pu].poll();
            }
            return !pq[pu].isEmpty() ? pq[pu].peek() : -2;
        }
    }

    public int[] processQueries(int c, int[][] connections, int[][] queries) {
        return null;
    }
}
