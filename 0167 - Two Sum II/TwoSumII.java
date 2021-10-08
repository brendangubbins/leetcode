class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        int sum = -1;
        while (sum != target) {
            sum = numbers[j] + numbers[i];
            if (sum > target) {
                j--;
            } 
            else if (sum < target) {
                i++;
            }
        }
        
        return new int[]{i+1,j+1};
    }
}
