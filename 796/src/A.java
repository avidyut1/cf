import java.io.*;
import java.util.*;
import java.math.*;

/**
 * created by asheshvidyut on 10/04/17
 **/
public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            int m = in.readInt();
            int k = in.readInt();
            int ar[] = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = in.readInt();
            }
            int minDistance = Integer.MAX_VALUE;
            for (int i = m; i < n; i++) {
                if (ar[i] > 0 && ar[i] <= k) {
                    minDistance = Math.min(minDistance, (i - (m - 1)) * 10);
                }
            }
            for (int i = 0; i < m - 1; i++) {
                if (ar[i] > 0 && ar[i] <= k) {
                    minDistance = Math.min(minDistance, ((m - 1) - (i)) * 10);
                }
            }
            out.write(Integer.toString(minDistance));
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
