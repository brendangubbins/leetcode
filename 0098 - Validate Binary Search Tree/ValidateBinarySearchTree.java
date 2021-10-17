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
  public boolean isValidBST(TreeNode root) {
    return validate(root, (long)(Integer.MIN_VALUE) - 1, (long)(Integer.MAX_VALUE) + 1);
  }
  
  public boolean validate(TreeNode root, long min, long max) {
    if (root == null) {
      return true;
    }
    
    if (min >= root.val || max <= root.val) {
      return false;
    }
    
    return validate(root.left, min, root.val) && validate(root.right, root.val, max);
  }
}
