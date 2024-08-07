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
 // tc:o(n)[visit each node once], sc:o(n)
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) return result;

        queue.add(root);
        while(!queue.isEmpty()){
             int len = queue.size(); // this step is important because queue size keep changing and calculating the length helps to keep the queue size fixed.
            List<Integer> level = new ArrayList<>();
            for(int i = 0;i<len;i++){
                TreeNode current = queue.poll();
                level.add(current.val);
                if(current.left != null){
                    queue.add(current.left);
                }
                if(current.right !=null){
                    queue.add(current.right);
                }
            }
             result.add(level);
        }
        return result;

        
    }
}