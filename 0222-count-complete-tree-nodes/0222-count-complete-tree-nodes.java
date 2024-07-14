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
        int res = 0;
        int[] count = new int[1];
        res = pre(root,count);
        
        return res ;
        
        
    }
    public int pre(TreeNode root,int[] count){
    if(root == null){
            return count[0];
        }
        count[0] = count[0] + 1;
        
        pre(root.left,count);
        
        pre(root.right,count);
        return count[0];
    }
}