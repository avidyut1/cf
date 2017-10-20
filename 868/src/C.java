import java.io.*;
import java.util.*;
import java.math.*;

public class C {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            int k = in.readInt();
            int ar[][] = new int[n][k];
            boolean yes = false;
            boolean dp[] = new boolean[1 << k];
            for (int i = 0; i < n; i++) {
                int x = 0;
                for (int j = 0; j < k; j++) {
                    int known = in.readInt();
                    x += known == 1 ? (1 << j): 0;
                }
                dp[x] = true;
            }
            //considering only two cases
            //all team dosen't know a single problem
            //some team knows one problem and some team knows second problem (considering two problems)
            boolean ok = dp[0];
            for (int i = 0; i < 1 << k; i++) {
                for (int j = 0; j < 1 << k; j++) {
                    if ((i & j) == 0 && dp[i] && dp[j]) {
                        ok = true;
                    }
                }
            }
            if (ok) {
                out.write("YES");
            }
            else {
                out.write("NO");
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
