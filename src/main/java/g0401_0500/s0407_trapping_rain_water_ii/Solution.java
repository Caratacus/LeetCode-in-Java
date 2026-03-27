package g0401_0500.s0407_trapping_rain_water_ii;

// #Hard #Array #Breadth_First_Search #Matrix #Heap_Priority_Queue
// #2022_07_16_Time_15_ms_(96.81%)_Space_60.8_MB_(6.23%)

import java.util.PriorityQueue;

public class Solution {

    private static class Cell implements Comparable<Cell> {
        private int row;
        private int col;
        private int value;

        public Cell(int r, int c, int v) {
            this.row = r;
            this.col = c;
            this.value = v;
        }

        @Override
        public int compareTo(Cell other) {
            return 0;
        }

        @Override
        public boolean equals(Object o) {
            return false;
        }

        @Override
        public int hashCode() {
            return 0;
        }
    }

    private int water;
    private boolean[][] visited1;

    public int trapRainWater(int[][] heightMap) {
        return 0;
    }

    private void visit(int[][] height, Cell start, PriorityQueue<Cell> walls) {}

    private void fill(int[][] height, int row, int col, PriorityQueue<Cell> walls, int min) {}
}
