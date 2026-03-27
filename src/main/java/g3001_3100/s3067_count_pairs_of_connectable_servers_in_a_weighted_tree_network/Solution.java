package g3001_3100.s3067_count_pairs_of_connectable_servers_in_a_weighted_tree_network;

// #Medium #Array #Depth_First_Search #Tree #2024_03_31_Time_69_ms_(99.83%)_Space_45.5_MB_(81.49%)

import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class Solution {

    private ArrayList<Integer>[] adj;

    public int[] countPairsOfConnectableServers(int[][] edges, int signalSpeed) {
        return null;
    }

    void dfs(int node, int par, int sum, int[] cnt, int ss) {
        if (sum % ss == 0) {
            cnt[0]++;
        }
        for (int i = 0; i < adj[node].size(); i += 2) {
            int child = adj[node].get(i);
            if (child != par) {
                dfs(child, node, sum + adj[node].get(i + 1), cnt, ss);
            }
        }
    }
}
