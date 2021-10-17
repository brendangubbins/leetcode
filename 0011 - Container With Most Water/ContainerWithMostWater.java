class Solution {
  public int maxArea(int[] height) {
    int front = 0;
    int back = height.length - 1;
    int maxArea = 0;
    int area = 0;
    
    while (front <= back) {
      area = Math.min(height[front], height[back]) * (back - front);
      maxArea = Math.max(maxArea, area);
      
      if (height[back] <= height[front]) {
        back--;
      } else {
        front++;
      }
      
    }
    
    return maxArea;
  }
}
