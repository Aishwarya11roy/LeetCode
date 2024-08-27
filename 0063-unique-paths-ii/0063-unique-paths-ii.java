class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        // Create a dp array to store the number of unique paths
        int[][] dp = new int[m][n];

        // Initialize the starting position
        if (obstacleGrid[0][0] == 1) {
            dp[0][0] = 0;  // If there's an obstacle at the start, no paths are possible
        } else {
            dp[0][0] = 1;  // Otherwise, there's one way to start (by being at the start)
        }

        // Fill the first column
        for (int i = 1; i < m; i++) {
            if (obstacleGrid[i][0] == 1 || dp[i-1][0] == 0) {
                dp[i][0] = 0;  // If there's an obstacle, or the cell above is unreachable, set to 0
            } else {
                dp[i][0] = 1;  // Otherwise, it's reachable
            }
        }

        // Fill the first row
        for (int j = 1; j < n; j++) {
            if (obstacleGrid[0][j] == 1 || dp[0][j-1] == 0) {
                dp[0][j] = 0;  // If there's an obstacle, or the cell to the left is unreachable, set to 0
            } else {
                dp[0][j] = 1;  // Otherwise, it's reachable
            }
        }

        // Fill the dp array for the rest of the grid
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0;  // No paths through an obstacle
                } else {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];  // Paths from above and left
                }
            }
        }

        // The answer is the number of ways to reach the bottom-right corner
        return dp[m-1][n-1];
    }
}
