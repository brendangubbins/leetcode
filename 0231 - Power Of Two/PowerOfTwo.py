class Solution:
    def isPowerOfTwo(self, n: int) -> bool:
        if n == 1:
            return True
        
        two_pow = 1
        
        while two_pow < n:
            two_pow *= 2
            if two_pow == n:
                return True
            
        return False
        