package g2201_2300.s2290_minimum_obstacle_removal_to_reach_corner;

// #Hard #Array #Breadth_First_Search #Matrix #Heap_Priority_Queue #Graph #Shortest_Path
// #2022_06_17_Time_172_ms_(82.27%)_Space_85.6_MB_(84.16%)

public class Solution {

    public int minimumObstacles(int[][] grid) {
        return 0;
    }

    private static class State {
        int r;
        int c;
        int removed;

        State(int r, int c, int removed) {
            this.r = r;
            this.c = c;
            this.removed = removed;
        }
    }
}
