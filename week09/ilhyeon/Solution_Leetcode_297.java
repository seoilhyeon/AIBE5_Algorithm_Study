package week09.ilhyeon;

import java.util.LinkedList;
import java.util.Queue;

public class Solution_Leetcode_297 {

    public class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            if (root == null) {
                return "";
            }

            StringBuilder sb = new StringBuilder();
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            sb.append(root.val);

            while (!q.isEmpty()) {
                TreeNode node = q.poll();

                if (node.left != null) {
                    q.add(node.left);
                    sb.append(",").append(node.left.val);
                } else {
                    sb.append(",null");
                }

                if (node.right != null) {
                    q.add(node.right);
                    sb.append(",").append(node.right.val);
                } else {
                    sb.append(",null");
                }
            }

            sb.setLength(sb.length());
            return sb.toString();
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            String[] split = data.split(",");
            if (split.length == 0 || split[0].isBlank() || split[0].equals("null")) {
                return null;
            }

            int idx = 0;
            TreeNode root = new TreeNode(Integer.valueOf(split[idx++]));
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);

            while (!q.isEmpty() && idx < split.length) {
                TreeNode node = q.poll();

                if (idx < split.length && !split[idx].equals("null")) {
                    node.left = new TreeNode(Integer.valueOf(split[idx]));
                    q.add(node.left);
                }
                idx++;

                if (idx < split.length && !split[idx].equals("null")) {
                    node.right = new TreeNode(Integer.valueOf(split[idx]));
                    q.add(node.right);
                }
                idx++;
            }

            return root;
        }
    }
}
