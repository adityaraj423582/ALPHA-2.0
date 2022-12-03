package Competive_Programming;

public class Finding_max_profit {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int max_profit = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] > arr[i]){
                    int profit = arr[j] - arr[i];
                    if(profit > max_profit){
                        max_profit = profit;
                    }
                }
            }
        }
        System.out.println(max_profit);
    }
}
