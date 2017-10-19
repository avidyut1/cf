import java.io.*;
import java.util.*;
import java.math.*;

/**
 * created by asheshvidyut on 25/06/17
 **/
public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int m = in.readInt();
            int b = in.readInt();
            long ans = Integer.MIN_VALUE;
            for (int y = 0; y <= b; y++) {
                int x = (b - y) * m;
                long lans = ((x + 1) * summation(y)) + ((y + 1) * summation(x));
                ans = Math.max(lans, ans);
            }
            out.write(Long.toString(ans));
            out.newLine();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static long summation(int n) {
        return ((long)(n) * (n + 1)) / 2;
    }
}
