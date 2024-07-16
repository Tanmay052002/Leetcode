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
        List<Integer> al = new ArrayList<>();
        
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

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
            al.add(sum);
        }
        int max = al.get(0);
        int size = al.size();
        int j = 0;

        for(int i = 0; i<size ; i++){
            if(al.get(i) > max){
                max = al.get(i);
                j = i;
            }
        }

        return j+1;
    }
}