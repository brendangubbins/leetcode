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
  public int rangeSumBST(TreeNode root, int low, int high) {
    if (root == null) {
      return 0;        
    }
    
    int sum = (root.val >= low && root.val <= high) ? root.val : 0;
    
    return sum + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
  }
  
  /* ITERATIVE:
  public int rangeSumBST(TreeNode root, int low, int high) {
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    int sum = 0;
    
    while (!stack.isEmpty()) {
      root = stack.pop();
      sum += (root.val >= low && root.val <= high) ? root.val : 0;
      
      if (root.left != null) {
        stack.push(root.left);
      }
      
      if (root.right != null) {
        stack.push(root.right);
      }
    }
    
    return sum;
  }
  */
}
