import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            long a[] = new long[n];
            long max = Long.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                a[i] = in.readLong();
                max = Math.max(a[i], max);
            }
            long ans = 0l;
            for (int i = 0; i < n; i++) {
                ans += max - a[i];
            }
            out.write(Long.toString(ans));
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
