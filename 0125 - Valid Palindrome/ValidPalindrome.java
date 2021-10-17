class Solution {
  public boolean isPalindrome(String s) {
    Stack<Character> stack = new Stack<>();
    Deque<Character> queue = new ArrayDeque<>(); 
    
    for (int i = 0; i < s.length(); i++) {
      char c = Character.toLowerCase(s.charAt(i));
      if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
        stack.push(c);
        queue.offer(c);
      }
    }
    
    int size = stack.size() / 2;
    
    while (stack.size() > size) {
      char c1 = stack.pop();
      char c2 = queue.poll();
      if (c1 != c2) {
        return false;
      }
    }
    
    return true;
  }
}
