package g1401_1500.s1496_path_crossing;

// #Easy #String #Hash_Table #2022_03_23_Time_1_ms_(97.41%)_Space_42.9_MB_(31.41%)

public class Solution {

    public boolean isPathCrossing(String path) {
        return false;
    }

    private static class Coord {
        int x;
        int y;

        public Coord(int x, int y) {
            this.x = x;
            this.y = y;
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
}
