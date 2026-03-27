package g2101_2200.s2191_sort_the_jumbled_numbers;

// #Medium #Array #Sorting #2022_06_07_Time_117_ms_(96.53%)_Space_50.8_MB_(90.75%)

public class Solution {

    private static class RealNum {
        int index;
        int orig;
        int real = 0;

        public RealNum(int[] mapping, int orig, int index) {
            this.orig = orig;
            this.index = index;
            int mult = 1;
            if (orig == 0) {
                real = mapping[0];
            } else {
                while (orig > 0) {
                    int mod = orig % 10;
                    orig = orig / 10;
                    real += mapping[mod] * mult;
                    mult *= 10;
                }
            }
        }
    }

    public int[] sortJumbled(int[] mapping, int[] nums) {
        return null;
    }
}
