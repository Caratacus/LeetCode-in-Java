package g1201_1300.s1292_maximum_side_length_of_a_square_with_sum_less_than_or_equal_to_threshold;

// #Medium #Array #Binary_Search #Matrix #Prefix_Sum #Binary_Search_II_Day_15
// #2022_03_10_Time_23_ms_(32.97%)_Space_78_MB_(14.49%)

public class Solution {

    public int maxSideLength(int[][] mat, int threshold) {
        return 0;
    }

    int min(int length, int[][] prefix) {
        int min = 0;
        for (int i = length - 1; i < prefix.length; i++) {
            for (int j = length - 1; j < prefix[0].length; j++) {
                if (i == length - 1 && j == length - 1) {
                    min = prefix[i][j];
                } else if (i - length < 0) {
                    min = Math.min(min, prefix[i][j] - prefix[i][j - length]);
                } else if (j - length < 0) {
                    min = Math.min(min, prefix[i][j] - prefix[i - length][j]);
                } else {
                    min =
                            Math.min(
                                    min,
                                    prefix[i][j]
                                            - prefix[i][j - length]
                                            - prefix[i - length][j]
                                            + prefix[i - length][j - length]);
                }
            }
        }
        return min;
    }
}
