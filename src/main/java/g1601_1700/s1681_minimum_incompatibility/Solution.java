package g1601_1700.s1681_minimum_incompatibility;

// #Hard #Array #Dynamic_Programming #Bit_Manipulation #Bitmask
// #2022_04_17_Time_1_ms_(100.00%)_Space_39.8_MB_(97.56%)

public class Solution {

    private static class Node {
        boolean[] visited;
        int size;
        int min;
        int max;

        Node() {
            visited = new boolean[17];
            min = 20;
            max = 0;
            size = 0;
        }
    }

    private Node[] nodes;
    private int size;
    private int result = 1_000_000;
    private int currentSum;

    public int minimumIncompatibility(int[] nums, int k) {
        return 0;
    }

    private void solve(int[] nums, int idx) {}
}
