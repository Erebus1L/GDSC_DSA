class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        for(int i=0; i<=n; i++){
            dp[i] = -1;
        }
        dp[0] = 1;
        dp[1] = 1;
        if(n==0 || n==1){
            return 1;
        }
        int count  = 0;
        for(int i=2; i<=n; i++){
            if(dp[i] != -1){
                count = dp[i];
            }else{
                count = dp[i] = dp[i-1]+dp[i-2];
            }
        }
        return count;
    }
    
}

class ClimbingStairs {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        for(int i=0; i<=n; i++){
            dp[i] = -1;
        }
        return helper(n, dp);
    }
    public int helper(int n, int[]dp){
        if(n<0){
            return 0;
        }
        if(n==0){
            dp[0] = 1;
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n] = helper(n-1, dp) + helper(n-2, dp);
    }
}