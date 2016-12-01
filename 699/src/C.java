import java.io.*;
import java.util.*;
import java.math.*;

public class C {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int gs[][] = new int[n][2];
            for (int i = 0; i < n; i++) {
                int ind = in.readInt();
                if (ind == 0) {
                    gs[i][0] = 0;
                    gs[i][1] = 0;
                }
                else if(ind == 1) {
                    gs[i][0] = 0;
                    gs[i][1] = 1;
                }
                else if(ind == 2) {
                    gs[i][0] = 1;
                    gs[i][1] = 0;
                }
                else{
                    gs[i][0] = 1;
                    gs[i][1] = 1;
                }
            }
            int dp[][] = new int[n][2];
            dp[0][0] = gs[0][0];
            dp[0][1] = gs[0][1];
            for (int i = 1; i < n; i++) {
                dp[i][0] = dp[i - 1][1];
                if (gs[i][0] == 0){
                    dp[i][0] = Math.max(dp[i][0], dp[i - 1][0]);
                }
                else if(gs[i][0] == 1) {
                    if (i - 2 >= 0 && gs[i - 2][0] == 1) {
                        dp[i][0] = Math.max(dp[i][0], dp[i - 2][0] + 1);
                    }
                    if (gs[i - 1][0] == 0) {
                        dp[i][0] = Math.max(dp[i][0], dp[i - 1][0] + 1);
                    }
                    if (i - 2 >= 0) {
                        dp[i][0] = Math.max(dp[i][0], dp[i - 2][1] + 1);
                        dp[i][0] = Math.max(dp[i][0], dp[i - 2][0] + 1);
                    }
                    dp[i][0] = Math.max(dp[i][0], dp[i - 1][1] + 1);
                }
                dp[i][1] = dp[i - 1][0];
                if (gs[i][1] == 0) {
                    dp[i][1] = Math.max(dp[i][1], dp[i - 1][1]);
                }
                else if(gs[i][1] == 1) {
                    if (i - 2 >= 0 && gs[i - 2][1] == 1) {
                        dp[i][1] = Math.max(dp[i][1], dp[i - 2][1] + 1);
                    }
                    if(gs[i - 1][1] == 0) {
                        dp[i][1] = Math.max(dp[i][1], dp[i - 1][1] + 1);
                    }
                    if (i - 2 >= 0) {
                        dp[i][1] = Math.max(dp[i][1], dp[i - 2][0] + 1);
                        dp[i][1] = Math.max(dp[i][1], dp[i - 2][1] + 1);
                    }
                    dp[i][1] = Math.max(dp[i][1], dp[i - 1][0] + 1);
                }
            }
//            for (int i = 0; i < n; i++) {
//                System.out.println(Arrays.toString(dp[i]));
//            }
            System.out.println(n - Math.max(dp[n - 1][0], dp[n - 1][1]));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
