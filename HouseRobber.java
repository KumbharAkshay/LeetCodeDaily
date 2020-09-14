class Solution {
    public int rob(int[] nums) {
        int currMax = 0;
        int prevMax = 0;
        for(int x : nums){
            int temp = currMax;
            currMax = Math.max(currMax, prevMax + x);
            prevMax = temp;
        }
        return currMax;
    }
}