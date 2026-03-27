package g3001_3100.s3093_longest_common_suffix_queries;

// #Hard #Array #String #Trie #2024_04_18_Time_39_ms_(93.67%)_Space_160.9_MB_(66.40%)

public class Solution {

    public int[] stringIndices(String[] wc, String[] wq) {
        return null;
    }

    private static class Trie {
        Trie[] ch;
        int index;

        Trie(int index) {
            this.ch = new Trie[26];
            this.index = index;
        }

        Trie get(char ch) {
            return this.ch[ch - 'a'];
        }

        boolean has(char ch) {
            return this.ch[ch - 'a'] != null;
        }

        void put(char ch, int index) {
            this.ch[ch - 'a'] = new Trie(index);
        }
    }
}
