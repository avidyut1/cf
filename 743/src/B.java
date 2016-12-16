import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            long k = in.readLong();
            final int MAX = 51;
            long pow2[] = new long[MAX];
            pow2[0] = 1l;
            for (int i = 1; i < MAX; i++) {
                pow2[i] = 2l * pow2[i - 1];
            }
            for (int i = n; i >= 1; i--) {
                long find = pow2[i - 1];
                long dist = pow2[i];
                k -= find;
                if (k % dist == 0) {
                    System.out.println(i);
                    return;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
