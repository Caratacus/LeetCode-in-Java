package g0901_1000.s0968_binary_tree_cameras;

// #Hard #Dynamic_Programming #Depth_First_Search #Tree #Binary_Tree #Udemy_Tree_Stack_Queue
// #2022_03_31_Time_0_ms_(100.00%)_Space_41.4_MB_(98.84%)

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
public class Solution {

    private int cameras;

    public int minCameraCover(TreeNode root) {
        return 0;
    }

    //  States =>
    // -1 : Node needs a camera
    //  0 : Node has a camera placed
    //  1 : Node is covered somehow
    private int minCameras(TreeNode root) {
        return 0;
    }
}
