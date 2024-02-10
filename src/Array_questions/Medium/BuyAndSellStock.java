package pricesay_questions.Medium;

public class BuyAndSellStock {
    public static void main(String[] args) {
        int [] prices = {7,6,4,3,1};
        System.out.println(sollution(prices));
    }

    //Brute Force
    static int sollution(int []prices){
        int maxPro = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] > prices[i]) {
                    maxPro = Math.max(prices[j] - prices[i], maxPro);
                }
            }
        }
        return maxPro;
    }

    static int Optimal(int []arr){
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i =0; i< arr.length; i++){
            minPrice = Math.min(minPrice, arr[i]);
            maxProfit = Math.max(maxProfit, arr[i] - minPrice);
        }
        return maxProfit;
    }
}
