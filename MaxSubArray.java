class Solution {
    public int maxSubArray(int[] nums) {
      
       int max_sum = Integer.MIN_VALUE;
        int cur = 0;
        
        for(int i=0;i<nums.length;i++){
            cur+=nums[i];
            max_sum = Math.max(max_sum, cur);
            if(cur < 0){
                cur = 0;
            }
        }
        return max_sum;
    }    
}