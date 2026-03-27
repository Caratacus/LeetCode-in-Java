package g3501_3600.s3525_find_x_value_of_array_ii;

// #Hard #Array #Math #Segment_Tree #2025_04_22_Time_177_ms_(79.87%)_Space_89.05_MB_(49.67%)

public class Solution {

    private int k;
    private Node[] seg;
    private int[] nums;

    private class Node {
        int prod;
        int[] cnt;

        Node() {
            prod = 1 % k;
            cnt = new int[k];
        }
    }

    private Node merge(Node l, Node r) {
        return null;
    }

    private void build(int idx, int l, int r) {}

    private void update(int idx, int l, int r, int pos, int val) {}

    private Node query(int idx, int l, int r, int ql, int qr) {
        return null;
    }

    public int[] resultArray(int[] nums, int k, int[][] queries) {
        return null;
    }
}
