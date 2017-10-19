import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            int c[] = new int[n];
            int s[] = new int[n];
            int min = Integer.MAX_VALUE, max = 0;
            for (int i = 0; i < n; i++) {
                c[i] = in.readInt();
                min = Math.min(c[i], min);
                max = Math.max(c[i], max);
            }
            for (int i = 0; i < n; i++) {
                s[i] = in.readInt();
            }
            int low = min, high = max;
            double ans = Double.MAX_VALUE;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

