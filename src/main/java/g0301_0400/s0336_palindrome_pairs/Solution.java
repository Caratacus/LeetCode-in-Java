package g0301_0400.s0336_palindrome_pairs;

// #Hard #Array #String #Hash_Table #Trie #2022_07_10_Time_1165_ms_(57.51%)_Space_270.4_MB_(47.12%)

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private static class TrieNode {
        TrieNode[] next;
        int index;
        List<Integer> list;

        TrieNode() {
            next = new TrieNode[26];
            index = -1;
            list = new ArrayList<>();
        }
    }

    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> res = new ArrayList<>();
        TrieNode root = new TrieNode();
        for (int i = 0; i < words.length; i++) {
            addWord(root, words[i], i);
        }
        for (int i = 0; i < words.length; i++) {
            search(words, i, root, res);
        }
        return res;
    }

    private void addWord(TrieNode root, String word, int index) {}

    private void search(String[] words, int i, TrieNode root, List<List<Integer>> res) {}

    private boolean isPalindrome(String word, int i, int j) {
        return false;
    }
}
