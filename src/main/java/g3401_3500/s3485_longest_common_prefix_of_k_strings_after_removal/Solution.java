package g3401_3500.s3485_longest_common_prefix_of_k_strings_after_removal;

// #Hard #Array #String #Trie #2025_03_17_Time_333_ms_(100.00%)_Space_64.12_MB_(100.00%)

public class Solution {

    private static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        int count = 0;
        int bestPrefixLength = -1;
    }

    private TrieNode root;

    public int[] longestCommonPrefix(String[] words, int k) {
        return null;
    }

    private void updateTrie(String word, int count, int k) {}
}
