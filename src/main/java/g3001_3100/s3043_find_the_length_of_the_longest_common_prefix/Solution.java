package g3001_3100.s3043_find_the_length_of_the_longest_common_prefix;

// #Medium #Array #String #Hash_Table #Trie #2024_02_29_Time_27_ms_(99.94%)_Space_55.6_MB_(78.30%)

public class Solution {

    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        return 0;
    }

    private static class Trie {
        TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        public void addWord(String word) {}

        public int findLongestPrefix(String word) {
            return 0;
        }
    }

    private static class TrieNode {
        TrieNode[] nodes;

        public TrieNode() {
            nodes = new TrieNode[10];
        }
    }
}
