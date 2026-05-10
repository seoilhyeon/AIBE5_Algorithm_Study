package week10.ilhyeon;

import week09.ilhyeon.TreeNode;

public class Solution_Leetcode_1038 {

    private int sum = 0;

    public TreeNode bstToGst(TreeNode root) {
        if (root == null) {
            return null;
        }

        bstToGst(root.right);
        sum += root.val;
        root.val = sum;
        bstToGst(root.left);

        return root;
    }
}
