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

        List<Integer> finList = new ArrayList<>();
        preorderHelper(root , finList);
        return finList;


        
    }
    private static void preorderHelper(TreeNode root ,List<Integer> finList ){
        if(root == null){
            return ;
        }

        finList.add(root.val);
        preorderHelper(root.left , finList);
        preorderHelper(root.right , finList);


    }
}