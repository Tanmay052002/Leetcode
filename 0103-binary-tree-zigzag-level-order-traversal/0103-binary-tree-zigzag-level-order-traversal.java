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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> mainList = new ArrayList<>();
        if(root == null){
            return mainList;
        }
	    
	    Stack<TreeNode> ms = new Stack<>();
	    Stack<TreeNode> cs = new Stack<>();
	    
	    
	    ms.push(root);
	    int lvl = 1;
	    
	    while(ms.size() > 0 ){
	            int size = ms.size();
                ArrayList<Integer> al = new ArrayList<>();

    	        for(int i = 1;i<=size;i++){
    	            TreeNode temp = ms.pop();
    	            al.add(temp.val);
	                if(lvl %2 != 0){
        	            if(temp.left != null){
        	                cs.push(temp.left);
        	            }
        	            if(temp.right != null){
        	                cs.push(temp.right);
        	            }
    	            }else{
        	            if(temp.right != null){
        	                cs.push(temp.right);
        	            }
        	            if(temp.left != null){
        	                cs.push(temp.left);
        	            }
    	            }   
	            }
	        lvl++;
            mainList.add(al);
	        Stack<TreeNode> temp = ms;
	        ms = cs;
	        cs = temp;
	    }
        return mainList;
    }
}