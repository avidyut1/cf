import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            long l1 = in.readLong();
            long r1 = in.readLong();
            long l2 = in.readLong();
            long r2 = in.readLong();
            long k = in.readLong();
            r1 = Math.min(r1, r2);
            l2 = Math.max(l1, l2);
            long ans = r1 - l2 + 1;
            if (k >= l2 && k <= r1) {
                ans--;
            }
            if (ans < 0) {
                ans = 0;
            }
            System.out.println(ans);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
