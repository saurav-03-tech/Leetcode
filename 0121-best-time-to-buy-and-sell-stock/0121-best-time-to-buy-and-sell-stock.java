class Solution {
    public int maxProfit(int[] prices) {
        int max_profit=0;
        int bestbuy=prices[0];
        for( int i=0;i<prices.length;i++){
            if(prices[i]>bestbuy){
                max_profit=Math.max(max_profit,prices[i]-bestbuy);
            }bestbuy=Math.min(bestbuy,prices[i]);
            
        }return max_profit;
        
    }
}