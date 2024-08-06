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
    public List<Integer> postorderTraversal(TreeNode root) {
         List<Integer> finList = new ArrayList<>();
        postorderHelper(root , finList);
        return finList;


        
    }
    private static void postorderHelper(TreeNode root ,List<Integer> finList ){
        if(root == null){
            return ;
        }

        
        postorderHelper(root.left , finList);
        postorderHelper(root.right , finList);
        finList.add(root.val);


    }
        
    
}