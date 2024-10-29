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
    public int maxDepth(TreeNode root) {

        if(root == null){
            return 0;
        }
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return Math.max(leftHeight , rightHeight)+1;
        
    }
}
/**
time complexity : o(n)
n : being number of nodes in the tree
space complexitu : o(h)
height of the tree

Explanation: The space complexity comes from the recursion stack used during the depth-first traversal. The maximum depth of the recursion stack will be equal to the height of the tree:
For a balanced tree (e.g., a perfect binary tree), the height 
ℎ
h is approximately 
logn, so the space complexity in this case is 
O(logn).

For a skewed tree (e.g., a tree where each node has only one child), the height 
h could be equal to 
n, resulting in a space complexity of 
O(n).
 */