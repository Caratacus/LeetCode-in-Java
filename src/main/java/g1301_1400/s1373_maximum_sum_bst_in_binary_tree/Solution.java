package g1301_1400.s1373_maximum_sum_bst_in_binary_tree;

// #Hard #Dynamic_Programming #Depth_First_Search #Tree #Binary_Tree #Binary_Search_Tree
// #2022_03_22_Time_15_ms_(47.56%)_Space_81.5_MB_(11.51%)

import com_github_leetcode.TreeNode;

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
@SuppressWarnings("java:S1700")
public class Solution {

    public int maxSumBST(TreeNode root) {
        return 0;
    }

    private static class IsBST {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        boolean isBst = true;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
    }

    private IsBST checkBST(TreeNode root) {
        return null;
    }
}
