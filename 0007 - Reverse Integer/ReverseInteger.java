class Solution {
    public int reverse(int x) {
        if (x == 0) return 0;
        boolean negative = x >= 0 ? false : true;
        int ans = "";
        if (negative) {
            x = -x;
        }
        boolean tail = true;
        while (x > 0) {
            if (x % 10 == 0 && tail) {
                x /= 10;
                continue;
            }
            tail = false;
            ans += x % 10;
            x /= 10;
        }
       try {
           return negative ? Integer.parseInt("-" + ans) : Integer.parseInt(ans);
       } catch (Exception e) {
           return 0;
       }
    }
}