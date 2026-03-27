package g2001_2100.s2002_maximum_product_of_the_length_of_two_palindromic_subsequences;

// #Medium #String #Dynamic_Programming #Bit_Manipulation #Backtracking #Bitmask
// #2022_05_22_Time_69_ms_(89.94%)_Space_53.8_MB_(41.42%)

import java.util.List;
import java.util.Set;

@SuppressWarnings("java:S135")
public class Solution {

    public int maxProduct(String s) {
        return 0;
    }

    private void recur(char[] chars, State s, List<State> list, Set<State> visited) {}

    private static class State {
        int i;
        int j;
        int cnt;
        int mask;

        public State(int i, int j, int cnt, int mask) {
            this.i = i;
            this.j = j;
            this.cnt = cnt;
            this.mask = mask;
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
