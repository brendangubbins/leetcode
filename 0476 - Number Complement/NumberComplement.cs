public class Solution {
    public int FindComplement(int num) {
        int ans = 0;
        int exp = 0;
        while (num > 0) {
            if (num % 2 == 0)
                ans += (int)Math.Pow(2, exp);
            exp++;
            num /= 2;
        }
        return ans;
    }
}