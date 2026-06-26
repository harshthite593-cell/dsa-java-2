public class problem121 {
    static void main(String[] args) {
        int max = 0;
        int[] prices  = {7,6,4,3,1};
        int min = prices[0];
        for(int i = 0 ; i < prices.length ;i++){
            if(prices[i]<min){
                min = prices[i];
            } else if (prices[i]-min>max){
                max = prices[i]-min;
            }
        }
        System.out.println(max);
    }
}
