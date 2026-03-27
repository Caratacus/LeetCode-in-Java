package g3201_3300.s3213_construct_string_with_minimum_cost;

// #Hard #Array #String #Dynamic_Programming #Suffix_Array
// #2024_07_15_Time_261_ms_(88.55%)_Space_67.2_MB_(45.91%)

public class Solution {

    private static class ACAutomaton {
        private static class Node {
            private char key;
            private Integer val = null;
            private int len;
            private final Node[] next = new Node[26];
            private Node suffix = null;
            private Node output = null;
            private Node parent = null;
        }

        public Node build(String[] patterns, int[] values) {
            return null;
        }

        private void put(Node root, String s, int val) {}

        public Node getOutput(Node node) {
            return null;
        }

        private Node go(Node node, char c) {
            return null;
        }

        private Node getSuffix(Node node) {
            return null;
        }
    }

    public int minimumCost(String target, String[] words, int[] costs) {
        return 0;
    }
}
