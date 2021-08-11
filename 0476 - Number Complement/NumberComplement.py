class Solution:
    def findComplement(self, num: int) -> int:
        exp = 0
        ans = 0
        while num > 0:
            current = round(num % 2)
            if current == 0:
                ans += pow(2, exp)
            exp += 1
            num = math.floor(num / 2)
        
        return ans