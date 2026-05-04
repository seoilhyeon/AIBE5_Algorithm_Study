package week10.ilhyeon;

import week09.ilhyeon.TreeNode;

public class Solution_Leetcode_108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        return organize(nums, 0, nums.length - 1);
    }

    private TreeNode organize(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) >> 1;
        TreeNode left = organize(nums, start, mid - 1);
        TreeNode right = organize(nums, mid + 1, end);
        TreeNode node = new TreeNode(nums[mid], left, right);
        return node;
    }
}
