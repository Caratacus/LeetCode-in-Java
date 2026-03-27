package g1301_1400.s1391_check_if_there_is_a_valid_path_in_a_grid;

// #Medium #Array #Depth_First_Search #Breadth_First_Search #Matrix #Union_Find
// #2022_03_17_Time_14_ms_(85.37%)_Space_57.4_MB_(94.63%)

public class Solution {

    private int[][][] dirs = {
        {{0, -1}, {0, 1}},
        {{-1, 0}, {1, 0}},
        {{0, -1}, {1, 0}},
        {{0, 1}, {1, 0}},
        {{0, -1}, {-1, 0}},
        {{0, 1}, {-1, 0}}
    };

    // the idea is you need to check port direction match, you can go to next cell and check whether
    // you can come back.
    public boolean hasValidPath(int[][] grid) {
        return false;
    }
}
