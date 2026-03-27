package g3001_3100.s3076_shortest_uncommon_substring_in_an_array;

// #Medium #Array #String #Hash_Table #Trie #2024_04_16_Time_9_ms_(99.97%)_Space_45.8_MB_(39.57%)

public class Solution {

    private final Trie root = new Trie();

    public String[] shortestSubstrings(String[] arr) {
        return null;
    }

    private void insert(char[] cs, int start, int end, int wordIndex) {}

    private int search(char[] cs, int start, int end, int wordIndex) {
        return 0;
    }

    private static class Trie {
        Trie[] children;
        int wordIndex;

        public Trie() {
            children = new Trie[26];
            wordIndex = -1;
        }
    }
}
