/**
 * Definition for a binary tree root.
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
    public int countNodes(TreeNode root) {
        pre(root);
        
        return count ;
        
    }
    int count = 0;
    public void pre(TreeNode root){
    if(root == null){
            return ;
        }
        count++;
        
        pre(root.left);
        
        pre(root.right);
        return ;
    }
}