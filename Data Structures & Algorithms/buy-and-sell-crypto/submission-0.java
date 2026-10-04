class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int ans = 0;
        while(l < r && r < prices.length){
            ans = Math.max(ans, prices[r] - prices[l]);
            if(prices[r] < prices[l]){
                l = r;
            }
            r++;
        }
        

        return ans;
    }
}
