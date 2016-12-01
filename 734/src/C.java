import java.io.*;
import java.util.*;
import java.math.*;

public class C {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int m = in.readInt();
            int k = in.readInt();
            int x = in.readInt();
            int s = in.readInt();
            long a[] = new long[m];
            for (int i = 0; i < m; i++) {
                a[i] = in.readLong();
            }
            long b[] = new long[m];
            for (int i = 0; i < m; i++) {
                b[i] = in.readLong();
            }
            long c[] = new long[k];
            for (int i = 0; i < k; i++) {
                c[i] = in.readLong();
            }
            long d[] = new long[k];
            for (int i = 0; i < k; i++) {
                d[i] = in.readLong();
            }
            long mintime = n * x;
            for (int i = 0; i < m; i++) {
                if (b[i] <= s) {
                    mintime = Math.min(mintime, n * a[i]);
                }
            }
            for (int i = 0; i < k; i++) {
                if(d[i] <= s) {
                    mintime = Math.min(mintime, (n - c[i]) * x);
                }
            }
            for (int i = 0; i < m; i++) {
                if (s < b[i]){
                    continue;
                }
                long remmoney = s - b[i];
                long complete = max_complete(d, remmoney, c);
                mintime = Math.min(mintime, (n - complete) * a[i]);
            }
            System.out.println(mintime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static long max_complete(long d[], long remmoney, long c[]) {
        int l = 0, h = d.length;
        while(l <= h) {
            int m  = (l + h) / 2;
            System.out.println(m);
            if (d[m] <= remmoney) {
                l = m + 1;
            }
            else {
                h = m -  1;
            }
        }
        return c[l];
    }
}
