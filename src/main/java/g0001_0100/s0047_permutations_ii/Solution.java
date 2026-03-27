package g0001_0100.s0047_permutations_ii;

// #Medium #Array #Backtracking #Algorithm_II_Day_10_Recursion_Backtracking
// #2023_08_11_Time_1_ms_(99.86%)_Space_44.4_MB_(45.65%)

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private List<List<Integer>> ans;

    public List<List<Integer>> permuteUnique(int[] nums) {
        ans = new ArrayList<>();
        permute(nums, 0);
        return ans;
    }

    private void permute(int[] nums, int p) {}

    private void swap(int[] nums, int i, int j) {}
}
