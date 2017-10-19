import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            int ar[] = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = in.readInt();
            }
            int max = -1, min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                max = Math.max(max, ar[i]);
                min = Math.min(min, ar[i]);
            }
            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (min < ar[i] && max > ar[i]) {
                    ans++;
                }
            }
            out.write(Integer.toString(ans));
            out.newLine();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
