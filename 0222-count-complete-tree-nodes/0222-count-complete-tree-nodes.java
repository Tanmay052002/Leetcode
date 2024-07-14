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
        res = pre(root,res);
        
        return res ;
        
        
    }
    public int pre(TreeNode root,int count){
    if(root == null){
            return 0;
        }

        
        int tempLeft = pre(root.left,count);
        
        int tempRight = pre(root.right,count);

        return tempLeft + tempRight + 1;
    }
}