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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> resultList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null){
            return resultList;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int len = queue.size();
            List<Integer> level = new ArrayList<>();
            for(int i = 0;i<len;i++){
                TreeNode current = queue.poll();
                level.add(current.val);
                if(current.left != null){
                    queue.add(current.left);
                }if(current.right != null){
                    queue.add(current.right);
                }
            }
            resultList.add(level);


        }
        Collections.reverse(resultList);
        return resultList;
        
    }
}