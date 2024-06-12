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
    public TreeNode invertTree(TreeNode root) {
        if(root== null){
            return null;
        }
        TreeNode node = new TreeNode(root.val);
        node.right = invertTree(root.left);
        node.left = invertTree(root.right);
        return node;

        
    }
}
/*
Time complexity : 0(n) - where n is the number of nodes of the tree
Space complexity : 0(h) -The space complexity depends on the height of the tree
denoted as h (where h can vary from log(n) to n, depending on whether the tree is balanced or skewed).
*/