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
    List<Integer> result = new LinkedList<>();
    
    inOrder(root, result);
    
    return result;
  }
  
  public void inOrder(TreeNode root, List<Integer> result) {
    if (root == null) {
      return;
    }
    
    if (root.left != null) {
      inOrder(root.left, result);
    }
    
    result.add(root.val);
    
    if (root.right != null) {
      inOrder(root.right, result);
    }
  }
}
