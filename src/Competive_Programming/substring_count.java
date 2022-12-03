package Competive_Programming;
import java.util.*;
import java.io.*;
public class substring_count {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for (int t_i = 0; t_i < T; t_i++) {
            int N = Integer.parseInt(br.readLine().trim());
            int K = Integer.parseInt(br.readLine().trim());
            String S = br.readLine();

            int out_ = solve(N, K, S);
            System.out.println(out_);

        }

        wr.close();
        br.close();
    }

    static int solve(int N, int K, String S) {
        // Write your code here
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j <= N; j++) {
                String sub = S.substring(i, j);
                if (sub.length() == K) {
                    if (isPalindrome(sub)) {
                        count++;
                    }
                }
            }
        }
        int result = 0;

        return result;
    }

    private static boolean isPalindrome(String sub) {
        int i = 0;
        int j = sub.length() - 1;
        while (i < j) {
            if (sub.charAt(i) != sub.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}