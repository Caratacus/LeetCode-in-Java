package g1901_2000.s1991_find_the_middle_index_in_array;

// #Easy #Array #Prefix_Sum #2022_05_18_Time_0_ms_(100.00%)_Space_40.2_MB_(97.29%)

public class Solution {
    // TC : O(1), SC: (1)
    public int findMiddleIndex(int[] nums) {
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
