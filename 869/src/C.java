import java.io.*;
import java.util.*;
import java.math.*;

public class C {
    final int MOD = 998244353;
    long ncr[][] = new long[5001][5001];
    long fact[] = new long[5001];
    public void precompute() {
        for (int i = 0; i < 5001; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    ncr[i][j] = 1L;
                }
                else if (i == j) {
                    ncr[i][j] = 1L;
                }
                else {
                    ncr[i][j] = (ncr[i - 1][j - 1] + ncr[i - 1][j]) % MOD;
                }
                ncr[i][j] %= MOD;
            }
        }
        fact[0] = 1L;
        for (int i = 1; i < fact.length; i++) {
            fact[i] = fact[i - 1] * (long)i;
            fact[i] %= MOD;
        }
    }
    public void solve() throws IOException {
        precompute();
        InputReader in = new InputReader(System.in);
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = in.readInt();
        int b = in.readInt();
        int c = in.readInt();
        long ans1 = 0L;
        long ans2 = 0L;
        long ans3 = 0L;
        for (int i = 0; i <= Math.min(a ,b); i++) {
            ans1 += ((ncr[a][i] * ncr[b][i]) % MOD * fact[i]) % MOD;
            ans1 %= MOD;
        }
        for (int i = 0; i <= Math.min(b, c); i++) {
            ans2 += ((ncr[b][i] * ncr[c][i]) % MOD * fact[i]) % MOD;
            ans2 %= MOD;
        }
        for (int i = 0; i <= Math.min(a, c); i++) {
            ans3 += ((ncr[a][i] * ncr[c][i]) % MOD * fact[i]) % MOD;
            ans3 %= MOD;
        }
        long ans = ans1 * ans2;
        ans %= MOD;
        ans = ans * ans3;
        ans %= MOD;
        out.write(Long.toString((ans) % MOD));
        out.close();
    }
    public static void main(String args[]) {
        try {
            C c = new C();
            c.solve();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
