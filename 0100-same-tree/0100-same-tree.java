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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Integer> al1 = lvlTravese(p);
        List<Integer> al2 = lvlTravese(q);
        
        return al1.equals(al2);
    }
    public List<Integer> lvlTravese(TreeNode root){
        List<Integer> al = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(q.size()>0){
            int n = q.size();
            for(int i = 1; i<=n;i++){
                TreeNode temp = q.remove();
                if(temp == null){
                    al.add(null);
                }else{
                    al.add(temp.val);
                    q.add(temp.left);
                    q.add(temp.right);
                }
            }
        }
        return al;
    }
}