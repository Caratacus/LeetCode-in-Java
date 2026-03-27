package g0601_0700.s0648_replace_words;

// #Medium #Array #String #Hash_Table #Trie #2022_03_21_Time_14_ms_(87.12%)_Space_58.8_MB_(59.91%)

import java.util.List;

public class Solution {

    public String replaceWords(List<String> dictionary, String sentence) {
        return null;
    }

    static class Node {
        Node[] links = new Node[26];
        boolean wordCompleted;

        public boolean containsKey(char ch) {
            return false;
        }

        public void put(char ch, Node node) {}

        public Node get(char ch) {
            return null;
        }

        public boolean isWordCompleted() {
            return false;
        }

        public void setWordCompleted(boolean flag) {}
    }

    static class Trie {
        Node root;

        public Trie() {
            root = new Node();
        }

        public void insert(String word) {}

        public String getRootForWord(String word) {
            return null;
        }
    }
}
