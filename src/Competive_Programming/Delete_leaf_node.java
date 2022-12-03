package Competive_Programming;

public class Delete_leaf_node {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        int[] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = arr[1];
        for(int i=2;i<n;i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+arr[i]);
        }
        System.out.println(dp[n-1]);
    }
}
