class Solution {
    public int uniquePaths(int m, int n) {

        int[][]dp = new int[m][n];

        //last row will have 1
        for(int j = 0;j<n;j++){
            dp[m-1][j] = 1;
        }
        //last column will have 1

        for(int i  = 0; i<m;i++){
            dp[i][n-1] = 1;
        }

        //starting from second last row and second last column

        for(int i = m-2;i>=0;i--){
            for(int j = n-2 ; j>=0;j--){
                dp[i][j] = dp[i][j+1] + dp[i + 1][j];
            }
        }
        return dp[0][0];
    }
}
/**
tc: o(m * n) - each cell is filled excatly once
sc: o(m * n)- size of the dp table we are taking

 */