import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int par[] = new int[n];
            final int MAX = (int)1e5 + 1;
            int count[] = new int[MAX];
            for (int i = 0; i < n; i++) {
                par[i] = in.readInt();
                count[par[i]]++;
            }
            int cum[] = new int[MAX];
            for (int i = 0; i < MAX; i++) {
                cum[i] = i - 1 >= 0 ? cum[i - 1] : 0;
                cum[i] += count[i];
            }
            int q = in.readInt();
            for (int i = 0; i < q; i++) {
                int m = in.readInt();
                int ans = cum[Math.min(MAX, m)];
                System.out.println(ans);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
