class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        amounts = []
        
        for i in range(amount + 1):
            amounts.append(amount + 1)
        
        amounts[0] = 0
        
        for i in range(len(amounts)):
            for j in range(len(coins)):
                coin = coins[j]
                if coin <= i:
                    amounts[i] = min(amounts[i], amounts[i - coin] + 1)
        
        if amounts[amount] > amount:
            return -1
        return amounts[amount]