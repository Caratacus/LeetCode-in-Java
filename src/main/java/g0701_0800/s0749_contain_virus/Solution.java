package g0701_0800.s0749_contain_virus;

// #Hard #Array #Depth_First_Search #Breadth_First_Search #Matrix #Simulation
// #2022_03_25_Time_23_ms_(37.62%)_Space_50.8_MB_(25.74%)

import java.util.Map;
import java.util.Set;

@SuppressWarnings("java:S107")
public class Solution {

    private int m;
    private int n;
    private final int[][] dirs = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};

    public int containVirus(int[][] grid) {
        return 0;
    }

    private void dfs(
            int i,
            int j,
            Set<Integer> visited,
            int[][] grid,
            Map<Integer, Set<Integer>> islands,
            Map<Integer, Set<Integer>> scores,
            Map<Integer, Integer> walls,
            int id) {}
}
