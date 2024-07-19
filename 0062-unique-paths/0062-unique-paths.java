class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int res = helper(m-1,n-1,dp);
        return res;
    }
    public int helper(int i , int j,int[][] dp){
        if(i==0 ||j==0){
            return 1;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int temp1 = helper(i-1,j,dp);
        int temp2 = helper(i,j-1,dp);
        dp[i][j] = temp1+temp2;
        return temp1+temp2;
    }
}