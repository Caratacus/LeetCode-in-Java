package g3201_3300.s3249_count_the_number_of_good_nodes;

// #Medium #Depth_First_Search #Tree #2024_08_13_Time_34_ms_(100.00%)_Space_113.9_MB_(90.70%)

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private int count = 0;

    public int countGoodNodes(int[][] edges) {
        return 0;
    }

    private int sizeOfTree(TNode node) {
        return 0;
    }

    private static class TNode {
        int val;
        int size;
        List<TNode> children;

        TNode(int val) {
            this.val = val;
            this.size = -1;
            this.children = new ArrayList<>();
        }
    }
}
