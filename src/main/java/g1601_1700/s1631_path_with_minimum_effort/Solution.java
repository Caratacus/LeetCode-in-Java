package g1601_1700.s1631_path_with_minimum_effort;

// #Medium #Array #Depth_First_Search #Breadth_First_Search #Binary_Search #Matrix
// #Heap_Priority_Queue #Union_Find #2022_04_19_Time_75_ms_(60.52%)_Space_42.8_MB_(86.40%)

@SuppressWarnings("java:S1210")
public class Solution {

    private static class Pair implements Comparable<Pair> {
        int row;
        int col;
        int diff;

        Pair(int row, int col, int diff) {
            this.row = row;
            this.col = col;
            this.diff = diff;
        }

        public int compareTo(Pair o) {
            return 0;
        }
    }

    public int minimumEffortPath(int[][] heights) {
        return 0;
    }
}
