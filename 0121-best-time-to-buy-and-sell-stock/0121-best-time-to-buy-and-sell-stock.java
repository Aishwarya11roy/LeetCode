class Solution {
    public int maxProfit(int[] prices) {
        int buyprice = prices[0];
        int maxprofit = 0;
        for(int i = 1;i<prices.length;i++){
            if(buyprice > prices[i] ){
                buyprice = prices[i];  
            }
             maxprofit = Math.max(maxprofit ,prices[i]-buyprice);
        }
        return maxprofit;     

}}