class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0)
        return 0;

        int profit=0;
        int buying_prices=prices[0];
        for(int i=0 ; i<prices.length ; i++){
            if(prices[i]<=buying_prices){
                buying_prices=prices[i];
                continue;
            }
            profit=Math.max(profit,prices[i]-buying_prices);
        }
        return profit;
    }
}