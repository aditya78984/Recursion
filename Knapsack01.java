public class Knapsack01 {
    // public static int mP(int index, int cap, int profit, int[] val, int[] wt){
    //     int take = 0, leave = 0, maxProfit = 0;
    //     if(cap < 0)
    //         return 0;
    //     if(cap == 0)
    //         return profit;
    //     if(index >= val.length)
    //         return profit;
        
    //     take = mP(index+1, cap-wt[index], profit+val[index], val, wt);
    //     leave = mP(index+1, cap, profit, val, wt);
    //     maxProfit = Math.max(take, leave);
    //     return maxProfit;
    // }
    public static int mP(int index, int cap, int[] val, int[] wt, int[][] dp){
        if(cap < 0 || index == val.length)
            return 0;
    
        if(dp[index][cap] != -1){
            return dp[index][cap];
        }
    
        int take = val[index] + mP(index + 1, cap - wt[index], val, wt, dp);
        int leave = mP(index + 1, cap, val, wt, dp);
        int maxProfit = Math.max(take, leave);
    
        dp[index][cap] = maxProfit;
        return maxProfit;
    }
    
    public static void main(String[] args) {
        int[] val = {15, 14, 10, 45, 30};
        int[] wt = {2, 5, 1, 3, 4};
        int cap = 7;
        int[][] dp = new int[val.length + 1][cap + 1];
    
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
    
        System.out.println(mP(0, cap, val, wt, dp));
    }
    
}
