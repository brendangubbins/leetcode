class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        
        int curr = 0;
        int carr = 0;
        
        int num_a, num_b;
        StringBuilder ans = new StringBuilder();
        
        while (i >= 0 || j >= 0) {
            if (i >= 0 && j >= 0) {
                num_a = Character.getNumericValue(a.charAt(i));
                num_b = Character.getNumericValue(b.charAt(j));
                curr = (num_a + num_b + carr) % 2;
                carr = (num_a + num_b + carr) / 2;
                ans.insert(0, Integer.toString(curr));
                i--;
                j--;
            } else if (i >= 0) {
                num_a = Character.getNumericValue(a.charAt(i));
                curr = (num_a + carr) % 2;
                carr = (num_a + carr) / 2;
                ans.insert(0, Integer.toString(curr));
                i--;
            } else if (j >= 0){
                num_b = Character.getNumericValue(b.charAt(j));
                curr = (num_b + carr) % 2;
                carr = (num_b + carr) / 2;
                ans.insert(0, Integer.toString(curr));
                j--;  
            }
        }
        
        if (carr > 0) {
            ans = ans.insert(0, "1");
            return ans.toString();
        }
        
        return ans.toString();
    }
}
