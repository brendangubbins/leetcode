class Solution {
  public String addStrings(String num1, String num2) {
    int i = num1.length() - 1;
    int j = num2.length() - 1;
    int current = 0, carry = 0;
    StringBuilder answer = new StringBuilder();
    
    while (i >= 0 || j >= 0) {
      if (i >= 0 && j >= 0) {
        current = (num1.charAt(i) - '0' + num2.charAt(j) - '0' + carry) % 10;
        carry = (num1.charAt(i) - '0' + num2.charAt(j) - '0' + carry) / 10;
        i--;
        j--;
        answer.append(Integer.toString(current));
      }
      else if (i >= 0) {
        current = (num1.charAt(i) - '0' + carry) % 10;
        carry = (num1.charAt(i) - '0' + carry) / 10;
        i--;
        answer.append(Integer.toString(current));
      }
      else {
        current = (num2.charAt(j) - '0' + carry) % 10;
        carry = (num2.charAt(j) - '0' + carry) / 10;
        j--;
        answer.append(Integer.toString(current));
      }
    }
    
    if (carry == 1) {
      answer.append("1");
    }
    
    return answer.reverse().toString();
  }
}
