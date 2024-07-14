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
        
        int res = pre(root);
        
        return res ;
        
        
    }
    public int pre(TreeNode root){
    if(root == null){
            return 0;
        }

        
        int tempLeft = pre(root.left);
        
        int tempRight = pre(root.right);

        return tempLeft + tempRight + 1;
    }
}