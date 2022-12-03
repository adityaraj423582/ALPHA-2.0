package Competive_Programming;

public class volcano {
    static int solve(int N, int M, int K, int[][] Volcano) {
        int[][] dp = new int[N + 1][M + 1];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= M; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        dp[0][0] = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (dp[i][j] == Integer.MAX_VALUE) {
                    continue;
                }
                for (int k = 0; k < K; k++) {
                    int ni = i + Volcano[k][0];
                    int nj = j + Volcano[k][1];
                    if (ni <= N && nj <= M) {
                        dp[ni][nj] = Math.min(dp[ni][nj], dp[i][j] + 1);
                    }
                }
            }
        }
        return dp[N][M];
    }
}
