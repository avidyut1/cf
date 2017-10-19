import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            int a = -1, b = -1;
            int min = Integer.MAX_VALUE;
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    int na = Math.min(i, n/i);
                    int nb = Math.max(i, n/i);
                    if (nb - na < min) {
                        min = nb - na;
                        b = nb;
                        a = na;
                    }
                }
            }
            out.write(a+" "+b);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
