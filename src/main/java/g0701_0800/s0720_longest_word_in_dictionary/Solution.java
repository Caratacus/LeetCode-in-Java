package g0701_0800.s0720_longest_word_in_dictionary;

// #Medium #Array #String #Hash_Table #Sorting #Trie
// #2022_03_24_Time_13_ms_(84.66%)_Space_53.7_MB_(38.25%)

public class Solution {

    private final Node root = new Node();
    private String longestWord = "";

    private static class Node {
        Node[] children;
        String str;

        public Node() {
            this.children = new Node[26];
            this.str = null;
        }

        public void insert(Node curr, String word) {}
    }

    public String longestWord(String[] words) {
        return null;
    }

    private void dfs(Node curr) {}
}
