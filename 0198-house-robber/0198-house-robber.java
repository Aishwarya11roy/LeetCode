class Solution {
    /*
    tc : o(n)
    sc:o(n)
    */
    public int rob(int[] nums) {
        // start with the base cases
        if(nums == null || nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);
        int [] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]) ;// to make sure which one has the max money
        for(int i = 2;i<nums.length;i++){
            // taking max of last two indexes
            dp[i] = Math.max(dp[i-1] , dp[i-2]+ nums[i]);
        }
        return dp[nums.length-1];
        
    }
}