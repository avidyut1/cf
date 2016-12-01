import java.io.*;
import java.util.*;
import java.math.*;

public class C {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int car[] = new int[n];
            for (int i = 0; i < n; i++) {
                car[i] = in.readInt();
            }
            String ar[] = new String[n];
            for (int i = 0; i < n; i++) {
                ar[i] = in.readLine();
            }
            long dp[][] = new long[n][2];
            for (int i = 0; i < n; i++) {
                Arrays.fill(dp[i], Long.MAX_VALUE);
            }
            dp[0][0] = 0;
            dp[0][1] = car[0];
            for (int i = 1; i < n; i++) {
                if(dp[i - 1][0] != Long.MAX_VALUE) {
                    if (ar[i - 1].compareTo(ar[i]) <= 0) {
                        dp[i][0] = dp[i - 1][0];
                    }
                    String rev = new StringBuffer(ar[i]).reverse().toString();
                    if (ar[i - 1].compareTo(rev) <= 0) {
                        dp[i][1] = dp[i - 1][0] + car[i];
                    }
                }
                if(dp[i - 1][1] != Long.MAX_VALUE) {
                    String revprev = new StringBuffer(ar[i - 1]).reverse().toString();
                    if (revprev.compareTo(ar[i]) <= 0) {
                        dp[i][0] = Math.min(dp[i - 1][1], dp[i][0]);
                    }
                    String rev = new StringBuffer(ar[i]).reverse().toString();
                    revprev = new StringBuffer(ar[i - 1]).reverse().toString();
                    if (revprev.compareTo(rev) <= 0) {
                        dp[i][1] = Math.min(dp[i][1], dp[i - 1][1] + car[i]);
                    }
                }
            }
            long ans = Math.min(dp[n - 1][0], dp[n - 1][1]);
            if (ans == Long.MAX_VALUE) {
                System.out.println(-1);
            }
            else
                System.out.println(ans);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
