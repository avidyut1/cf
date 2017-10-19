import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            long p = in.readLong();
            long q = in.readLong();
            long r = in.readLong();
            long dp[][] = new long[n][3];
            long ar[] = new long[n];
            for (int i = 0; i < n; i++) {
                ar[i] = in.readLong();
            }
            dp[0][0] = ar[0] * p;
            for (int i = 1; i < n; i++) {
                dp[i][0] = Math.max(dp[i - 1][0], p * ar[i]);
            }
            dp[0][1] = (ar[0] * q) + dp[0][0];
            for (int i = 1; i < n; i++) {
                dp[i][1] = Math.max(dp[i - 1][1], dp[i][0] + q * ar[i]);
            }
            dp[0][2] = (ar[0] * r) + dp[0][1];
            for (int i = 1; i < n; i++) {
                dp[i][2] = Math.max(dp[i - 1][2], dp[i][1] + r * ar[i]);
            }
            out.write(Long.toString(dp[n - 1][2]));
            out.newLine();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
