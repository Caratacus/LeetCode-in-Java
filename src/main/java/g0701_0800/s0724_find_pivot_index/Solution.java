package g0701_0800.s0724_find_pivot_index;

// #Easy #Array #Prefix_Sum #LeetCode_75_Prefix_Sum #Level_1_Day_1_Prefix_Sum
// #2022_03_24_Time_2_ms_(69.67%)_Space_52.1_MB_(59.19%)

public class Solution {

    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int left = 0;
        int right = sum;
        for (int i = 0; i < nums.length; i++) {
            right = right - nums[i];
            if (left == right) {
                return i;
            }
            left += nums[i];
        }
        return -1;
    }
}
