package g0101_0200.s0130_surrounded_regions;

// #Medium #Top_Interview_Questions #Array #Depth_First_Search #Breadth_First_Search #Matrix
// #Union_Find #Algorithm_II_Day_8_Breadth_First_Search_Depth_First_Search
// #Top_Interview_150_Graph_General #2022_06_23_Time_2_ms_(84.66%)_Space_51.4_MB_(62.38%)

public class Solution {

    public void solve(char[][] board) {}

    void dfs(char[][] board, int row, int column) {
        if (row < 0
                || row >= board.length
                || column < 0
                || column >= board[0].length
                || board[row][column] != 'O') {
            return;
        }
        board[row][column] = '#';
        dfs(board, row + 1, column);
        dfs(board, row - 1, column);
        dfs(board, row, column + 1);
        dfs(board, row, column - 1);
    }
}
