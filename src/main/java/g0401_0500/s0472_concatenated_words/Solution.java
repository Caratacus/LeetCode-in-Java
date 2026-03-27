package g0401_0500.s0472_concatenated_words;

// #Hard #Array #String #Dynamic_Programming #Depth_First_Search #Trie
// #2022_07_20_Time_84_ms_(74.09%)_Space_82_MB_(34.63%)

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private final List<String> ans = new ArrayList<>();
    private Trie root;

    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        return null;
    }

    private boolean search(String cur, int idx, int wordCnt) {
        return false;
    }

    private static class Trie {
        Trie[] nxt;
        boolean endHere;

        Trie() {
            nxt = new Trie[26];
            endHere = false;
        }
    }
}
