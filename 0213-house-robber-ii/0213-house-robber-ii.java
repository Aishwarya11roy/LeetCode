class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        
        if(len == 1){
            return nums[0];
        }

        // Compare the maximum amount of money when:
        // - robbing from house 0 to len-2 (helper1)
        // - robbing from house 1 to len-1 (helper2)
        return Math.max(helper1(nums), helper2(nums));
    }

    public static int helper1(int []nums) {
        int len = nums.length;
        if (len == 2) return nums[0]; // Since we are not including the last house

        int[] dp = new int[len];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for(int i = 2; i < len - 1; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
        }

        return dp[len-2];
    }
    
    public static int helper2(int []nums) {
        int len = nums.length;
        if (len == 2) return nums[1]; // Since we are not including the first house

        int[] dp = new int[len];
        dp[1] = nums[1];
        dp[2] = Math.max(nums[1], nums[2]);

        for(int i = 3; i < len; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
        }

        return dp[len-1];
    }
}
