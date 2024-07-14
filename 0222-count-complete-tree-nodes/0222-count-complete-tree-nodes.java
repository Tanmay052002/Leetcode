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
        
        int res = count(root);
        
        return res ;
        
        
    }
    public int count(TreeNode root){
    if(root == null){
            return 0;
        }

        
        int tempLeft = count(root.left);
        
        int tempRight = count(root.right);

        return tempLeft + tempRight + 1;
    }
}