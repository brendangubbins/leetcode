class Solution {
    public int maximumWealth(int[][] accounts) {
        int richestSum = 0;
        for (int i = 0; i < accounts.length; i++) {
            int currentSum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                currentSum += accounts[i][j];
            }
            if (currentSum > richestSum) {
                richestSum = currentSum;
            }
        }
        return richestSum;
    }
}