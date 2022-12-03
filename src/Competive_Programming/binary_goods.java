package Competive_Programming;

public class binary_goods {
    int solve(String S, int n) {
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        dp[0][0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (dp[i][j] == Integer.MAX_VALUE) {
                    continue;
                }
                if (S.charAt(i) == '0') {
                    dp[i + 1][j + 1] = Math.min(dp[i + 1][j + 1], dp[i][j]);
                    dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j] + 1);
                } else {
                    dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j]);
                    dp[i + 1][j + 1] = Math.min(dp[i + 1][j + 1], dp[i][j] + 1);
                }
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i <= n; i++) {
            ans = Math.min(ans, dp[n][i]);
        }
        return ans;
    }
}
