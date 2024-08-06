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
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> finList = new ArrayList<>();
        inorderHelper(root , finList);
        return finList;
       
    }
    private static void inorderHelper(TreeNode root , List<Integer> finList ){
        if(root == null){
            return ;
        }
        inorderHelper(root.left , finList);
        finList.add(root.val);
        inorderHelper(root.right , finList);
    }
}