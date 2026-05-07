package week10.ilhyeon;

import java.util.HashMap;
import java.util.Map;

import week09.ilhyeon.TreeNode;;

public class Solution_Leetcode_105 {

    private Map<Integer, Integer> valueToIndex = new HashMap<>();
    private int k = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            valueToIndex.put(inorder[i], i);
        }
        return organize(preorder, 0, inorder.length - 1);
    }

    private TreeNode organize(int[] preorder, int low, int high) {
        if (low > high) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[k++]);
        int mid = valueToIndex.get(root.val);
        root.left = organize(preorder, low, mid - 1);
        root.right = organize(preorder, mid + 1, high);

        return root;
    }
}
