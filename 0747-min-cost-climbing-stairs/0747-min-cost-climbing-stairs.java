class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int len = cost.length;
        if(len == 2){
            return Math.min(cost[0], cost[1]);
        }

        int dp[] = new int[len];
        dp[0] = cost[0]; // initial cost to reach to step 0
        dp[1] = cost[1];
        for(int i = 2;i<len;i++){
            dp[i]  = cost[i] + Math.min(dp[i-1] , dp[i-2]);
        }
        return Math.min(dp[len - 1], dp[len-2]);

        
    }

}

/**
Time Complexity: O(n), where n is the number of steps. This is because we only make a single pass through the array to fill the dp array.

Space Complexity: O(n), as we use an array of size n to store the minimum cost to reach each step.
 */