class Solution {
    public int minPathSum(int[][] grid) {
         int m = grid.length;
        int n = grid[0].length;

        // Create a dp array to store the minimum path sum for each cell
        int[][] dp = new int[m][n];

        // Initialize the starting position
        dp[0][0] = grid[0][0];

        // Fill the first row
        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }

        // Fill the first column
        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }

        // Fill the rest of the dp array
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = grid[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        // The answer is the minimum path sum to reach the bottom-right corner
        return dp[m - 1][n - 1];
        
    }
}