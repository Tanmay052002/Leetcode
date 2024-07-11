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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> al = new ArrayList<>();
        al = traversal(root);
        return al;
    }
    List<Integer> al = new ArrayList<>();
    public List<Integer> traversal(TreeNode root){
        if(root == null){
            return al;
        }
        al.add(root.val);

        traversal(root.left);
        
        traversal(root.right);

        return al;

    }
}