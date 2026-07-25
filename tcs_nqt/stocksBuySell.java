package tcs_nqt;

// import javainput.incridecriment;

public class stocksBuySell {
    public static void main(String[] args) {
        
        int[] price = {10,5,8,2,4,6};//7,1,5,3,6,9

        int minPrice = price[0];
        int maxProfit = 0;

        for(int i=1;i<price.length;i++){
            if(price[i] < minPrice){
                minPrice = price[i];
            }
            int profit = price[i] - minPrice;
            if(profit > maxProfit){
                maxProfit = profit;
            }
        }
        System.out.println("Maximum profit :"+maxProfit);
    }
    
}

// time complexity - O(n)
// space complexity - O(1)