package g0601_0700.s0691_stickers_to_spell_word;

// #Hard #Array #String #Dynamic_Programming #Bit_Manipulation #Backtracking #Bitmask
// #2022_03_22_Time_34_ms_(70.23%)_Space_54.1_MB_(35.88%)

import java.util.HashMap;
import java.util.HashSet;

public class Solution {

    // count the characters of every sticker
    private int[][] counts;
    // For each character, save the sticker index which has this character
    private HashMap<Character, HashSet<Integer>> map = new HashMap<>();
    private HashMap<Integer, Integer> cache = new HashMap<>();

    public int minStickers(String[] stickers, String target) {
        return 0;
    }

    private int dp(int bits, String target) {
        return 0;
    }
}
