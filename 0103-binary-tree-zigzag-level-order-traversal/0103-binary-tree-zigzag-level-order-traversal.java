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
        List<List<Integer>> resList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null){
            return resList;
        }
        queue.add(root);
        int trackLevel = 0;

        while(!queue.isEmpty()){
            int len = queue.size();
            List<Integer> level = new ArrayList<>();
            for(int i  = 0;i<len;i++){
                TreeNode current = queue.poll();// taking out the node value from the queue
                if(trackLevel % 2 == 0){
                level.add(current.val); // here we are adding to the inside list
                }else {
                    level.add(0,current.val);
                }
                
                if(current.left != null){
                    queue.add(current.left);
                }if(current.right !=null){
                    queue.add(current.right);
                }
            }
            trackLevel++;
            resList.add(level);
        }
        return resList;      
    }
}
/**
if even - add to the end of the list , if odd add to the beginning of the list
TC- o(n) : n is the number of nodes in the binary tree, as we need to traverse all the nodes.
SC - O(w): w is the maxmum number of nodes at any level.
 */