class Solution {
  public boolean isHappy(int n) {
    
    Set<Integer> set = new HashSet<>();
    int num = n;
    
    while (!set.contains(num)) {
      set.add(num);
      int sum = 0;
      // System.out.println("num: " + num);
      while (num > 0) {
        sum += (num % 10) * (num % 10);
        num /= 10;
      }
      // System.out.println("sum: " + sum);
      if (sum == 1) {
        return true;
      }
      num = sum;
    }
    
    return false;
  }
}
