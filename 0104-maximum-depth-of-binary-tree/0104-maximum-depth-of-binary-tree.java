/**
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
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        int size=0;
        while(!q.isEmpty()){
            int n=q.size();
            size++;
            for(int i=0;i<n;i++){
            root=q.poll();
                if(root.left!=null){
                    q.offer(root.left);
                }
                if(root.right!=null){
                    q.offer(root.right);
                }
            }
        }
        return size;
    }
}