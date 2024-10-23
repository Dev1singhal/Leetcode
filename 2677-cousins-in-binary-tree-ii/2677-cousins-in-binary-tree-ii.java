class Solution {
    public TreeNode replaceValueInTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        root.val = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            int levelSum = 0;
            List<TreeNode> nodes = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                nodes.add(node);
                if (node.left != null) {
                    levelSum += node.left.val;
                }
                if (node.right != null) {
                    levelSum += node.right.val;
                }
            }
            for (TreeNode node : nodes) {
                int siblingSum = 0;
                if (node.left != null) siblingSum += node.left.val;
                if (node.right != null) siblingSum += node.right.val;
                if (node.left != null) {
                    node.left.val = levelSum - siblingSum;
                    q.add(node.left);
                }
                if (node.right != null) {
                    node.right.val = levelSum - siblingSum;
                    q.add(node.right);
                }
            }
        }

        return root;
    }
}