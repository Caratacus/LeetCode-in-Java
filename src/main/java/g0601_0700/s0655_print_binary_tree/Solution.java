package g0601_0700.s0655_print_binary_tree;

// #Medium #Depth_First_Search #Breadth_First_Search #Tree #Binary_Tree
// #2022_03_21_Time_1_ms_(98.04%)_Space_42.4_MB_(79.96%)

import com_github_leetcode.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {

    public List<List<String>> printTree(TreeNode root) {
        List<List<String>> result = new LinkedList<>();
        int height = root == null ? 1 : getHeight(root);
        int columns = (int) (Math.pow(2, height) - 1);
        List<String> row = new ArrayList<>();
        for (int i = 0; i < columns; i++) {
            row.add("");
        }
        for (int i = 0; i < height; i++) {
            result.add(new ArrayList<>(row));
        }
        populateResult(root, result, 0, height, 0, columns - 1);
        return result;
    }

    private void populateResult(
            TreeNode root, List<List<String>> result, int row, int totalRows, int i, int j) {}

    private int getHeight(TreeNode root) {
        return 0;
    }
}
