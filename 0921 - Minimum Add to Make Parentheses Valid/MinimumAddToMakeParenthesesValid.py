class Solution:
    def minAddToMakeValid(self, s: str) -> int:
        ans = 0
        bal = 0
        
        for c in s:
            if c == '(':
                bal += 1
            if c == ')':
                bal -= 1
            if bal == -1:
                bal += 1
                ans += 1
                
        return ans + bal
        