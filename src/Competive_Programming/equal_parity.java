package Competive_Programming;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class equal_parity {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] s = br.readLine().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }
            int odd = 0, even = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
            if (odd == even) {
                System.out.println(0);
            } else if (odd > even) {
                if ((odd - even) % 2 == 0) {
                    System.out.println(1);
                } else {
                    System.out.println(-1);
                }
            } else {
                if ((even - odd) % 2 == 0) {
                    System.out.println(1);
                } else {
                    System.out.println(-1);
                }
            }
        }
    }
}

