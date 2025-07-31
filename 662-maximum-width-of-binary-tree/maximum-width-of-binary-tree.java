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
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        Queue<Pair<TreeNode, Integer>> q = new LinkedList<>();
        q.offer(new Pair<>(root, 0));
        int maxWidth = Integer.MIN_VALUE;
        while(!q.isEmpty()){
            int size = q.size();
            int firstIndex = q.peek().getValue();
            int index = 0;
            for(int i = 0 ; i < size ; i++){
                Pair<TreeNode, Integer> p = q.poll();
                TreeNode curr = p.getKey();
                index = p.getValue();
                if(curr.left != null){
                    q.offer(new Pair<>(curr.left, 2*index));
                }
                if(curr.right != null){
                    q.offer(new Pair<>(curr.right, 2*index+1));
                }
            }
            maxWidth = Math.max(maxWidth, index - firstIndex + 1);
        }
        return maxWidth;
    }
}