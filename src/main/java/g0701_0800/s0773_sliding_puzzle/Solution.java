package g0701_0800.s0773_sliding_puzzle;

// #Hard #Array #Breadth_First_Search #Matrix #2022_03_26_Time_9_ms_(81.80%)_Space_43.8_MB_(56.22%)

@SuppressWarnings("java:S1104")
public class Solution {

    private static class Node {
        public String board;
        public int depth;
        public int y;
        public int x;

        public Node(String board, int depth, int y, int x) {
            this.board = board;
            this.depth = depth;
            this.y = y;
            this.x = x;
        }
    }

    public int slidingPuzzle(int[][] board) {
        return 0;
    }

    public String swap(String board, int y1, int x1, int y2, int x2) {
        return null;
    }
}
