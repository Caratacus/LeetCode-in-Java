package g0801_0900.s0843_guess_the_word;

// #Hard #Array #String #Math #Game_Theory #Interactive
// #2022_03_24_Time_2_ms_(68.01%)_Space_41.5_MB_(70.30%)

import java.util.List;

/*
 * // This is the Master's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface Master {
 *     public int guess(String word) {}
 * }
 */
public class Solution {

    public interface Master {
        int guess(String word);
    }

    private int next = 0;

    public void findSecretWord(String[] wordlist, Master master) {}

    private void updateList(List<String> list, boolean[] test, int num) {}

    private int getSame(String word1, String word2) {
        return 0;
    }
}
