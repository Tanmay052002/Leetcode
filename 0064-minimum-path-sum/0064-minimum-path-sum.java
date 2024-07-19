class Solution {
    public int minPathSum(int[][] grid) {
        int m =grid.length;
        int n =grid[0].length;

        int[][] dp = new int[m][n];
        
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int res = helper(grid,m-1,n-1,dp);
        return res;
    }
    public int helper(int[][] grid, int i , int j,int[][] dp){
        if(i<0 || j<0){
            return Integer.MAX_VALUE;
        }
        if(i==0 && j==0){
            return grid[i][j];
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int x = helper(grid,i-1,j,dp);
        int y = helper(grid,i,j-1,dp);
        
        dp[i][j] = Math.min(x,y) + grid[i][j];
        
        return  Math.min(x,y) + grid[i][j];
    
    }
}