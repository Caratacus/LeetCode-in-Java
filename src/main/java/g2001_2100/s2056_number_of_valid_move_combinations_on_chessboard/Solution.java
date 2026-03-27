package g2001_2100.s2056_number_of_valid_move_combinations_on_chessboard;

// #Hard #Array #String #Simulation #Backtracking
// #2024_05_13_Time_195_ms_(41.18%)_Space_44.8_MB_(47.06%)

import java.util.ArrayList;

@SuppressWarnings("unchecked")
public class Solution {

    // 0: rook, queen, bishop
    private int[][][] dirs = {
        {{-1, 0}, {1, 0}, {0, -1}, {0, 1}},
        {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {1, 1}, {-1, -1}, {-1, 1}, {1, -1}},
        {{1, 1}, {-1, -1}, {-1, 1}, {1, -1}}
    };

    public int countCombinations(String[] pieces, int[][] positions) {
        return 0;
    }

    private int dfs(int[][] positions, ArrayList<int[]>[] stop, int[] stopIndex, int cur) {
        return 0;
    }

    private int check(int[][] positions, ArrayList<int[]>[] stop, int[] stopIndex) {
        return 0;
    }
}
