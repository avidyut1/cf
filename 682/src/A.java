import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int m = in.readInt();
            long a[] = new long[5];
            long b[] = new long[5];
            for (int i = 1; i <= n; i++) {
                a[i % 5]++;
            }
            for (int i = 1; i <= m; i++) {
                b[i % 5]++;
            }
            long ans = 0l;
            for (int i = 1; i < 5; i++) {
                ans += (a[i] * b[5 - i]);
            }
            ans += (a[0] * b[0]);
            System.out.println(ans);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
