class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m =obstacleGrid.length;
        int n =obstacleGrid[0].length;
        if(obstacleGrid[0][0] == 1){
            return 0;
        }
        int[][] dp = new int[m][n];
        
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int res = helper(obstacleGrid,m-1,n-1,dp);
        return res;
    }
    public int helper(int[][] obstacleGrid, int i , int j,int[][] dp){
        if(i<0 || j<0){
            return 0;
        }
        if(i==0 && j==0){
            return 1;
        }
        if(obstacleGrid[i][j] == 1){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int temp1 = helper(obstacleGrid,i-1,j,dp);
        int temp2 = helper(obstacleGrid,i,j-1,dp);
        dp[i][j] = temp1+temp2;
        return temp1+temp2;
    
    }
}