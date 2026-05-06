package week10.ilhyeon;

import week09.ilhyeon.TreeNode;

public class Solution_Leetcode_783 {

    private Integer prev = null;
    private int min = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return min;
    }

    private void inorder(TreeNode node) {
        if (node == null) {
            return;
        }

        inorder(node.left);

        if (prev != null) {
            min = Math.min(min, Math.abs(node.val - prev));
        }
        prev = node.val;

        inorder(node.right);
    }
}
