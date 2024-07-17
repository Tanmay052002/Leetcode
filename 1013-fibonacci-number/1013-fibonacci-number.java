class Solution {
    public int fib(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        int res = fibHelper(n,dp);

        return res;
    }
    public int fibHelper(int n,int dp[]){
        if(n==0 || n == 1){
            return n;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int temp1 = fibHelper(n-1,dp);
        int temp2 = fibHelper(n-2,dp);

        dp[n] = temp1+temp2;

        return temp1+temp2;

    }
}