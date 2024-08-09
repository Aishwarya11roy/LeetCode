/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public int maxPathSum(TreeNode root) {

        // Initialize result array to store the maximum path sum found during traversal
        int[] res = { Integer.MIN_VALUE };
        // Call the recursive function to calculate the maximum path sum
        findMaxPathSum(root, res);
        return res[0];
    }

    public int findMaxPathSum(TreeNode root, int[] res) {
        // Base case: If current node is null, return 0 (no contribution to path sum)
        if (root == null) {
            return 0;
        }
        // Recursively calculate maximum path sums for left and right subtrees
        int leftMaxPath = Math.max(0, findMaxPathSum(root.left, res));
        int rightMaxPath = Math.max(0, findMaxPathSum(root.right, res));
        // Update global maximum path sum considering current node and both children
        res[0] = Math.max(res[0], leftMaxPath + rightMaxPath + root.val);
        // Return maximum sum that can be extended to parent node (including current
        // node)
        return Math.max(leftMaxPath, rightMaxPath) + root.val;
    }
}

// tc :o(n)
// sc :o(h)

// Space Complexity: O(1) as no additional space or data structures is created that is proportional to the input size of the tree. O(H) Recursive Stack Auxiliary Space : The recursion stack space is determined by the maximum depth of the recursion, which is the height of the binary tree denoted as H. In the balanced case it is log2N and in the worst case its N.