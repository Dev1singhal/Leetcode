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
    public boolean hasPathSum(TreeNode root, int target) {
        Stack<TreeNode>path=new Stack<>();
        Stack<Integer>sum=new Stack<>();
        if(root==null){
            return false;
        }
        path.push(root);  
        sum.push(root.val);
        while(!path.isEmpty()){
            root=path.pop();
            int total=sum.pop();
            if(root.left==null && root.right==null && total==target){
                return true;
            }
            
            if(root.left!=null){
                path.push(root.left);
                sum.push(root.left.val+total);
            }
            if(root.right!=null){
                path.push(root.right);
                sum.push(root.right.val+total);
            }
        }
        return false;
    }
}