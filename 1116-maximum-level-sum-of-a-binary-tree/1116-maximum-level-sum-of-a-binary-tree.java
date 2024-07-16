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
    public int maxLevelSum(TreeNode root) {
        int max = Integer.MIN_VALUE;
        int maxlvl = 1;
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        int lvl = 1;
        while(q.size()>0){
            int n = q.size();
            int sum = 0;
            for(int i = 1; i<=n;i++){
                TreeNode temp = q.remove();
                if(temp != null){
                    sum = sum + temp.val;
                    if(temp.left != null){
                        q.add(temp.left);
                    }
                    if(temp.right != null){
                        q.add(temp.right);
                    }
                }
            }
            if(sum > max){
                max = sum;
                maxlvl = lvl;
            }
            lvl++;
        }
        

        return maxlvl;
    }
}