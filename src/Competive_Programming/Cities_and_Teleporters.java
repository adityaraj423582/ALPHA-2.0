package Competive_Programming;

public class Cities_and_Teleporters {
    public int solve(int N, int [] A, int X, int K) {
        int [] dp = new int [N+1];
        dp[0] = 0;
        for (int i = 1; i <= N; i++) {
            dp[i] = dp[i-1] + A[i-1];
            if (i >= K) {
                dp[i] = Math.min(dp[i], dp[i-K] + X);
            }
        }
        return dp[N];
    }
}
