import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            int k = in.readInt();
            int ar[] = new int[n];
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                ar[i] = in.readInt();
                max = Math.max(max, ar[i]);
                min = Math.min(min, ar[i]);
            }
            if (k == 1) {
                out.write(Integer.toString(min));
            }
            else if (k == n) {
                out.write(Integer.toString(max));
            }
            else {
                if (k >= 3) {
                    out.write(Integer.toString(max));
                }
                else {
                    int minTilliFront[] = new int[n];
                    Arrays.fill(minTilliFront, Integer.MAX_VALUE);
                    minTilliFront[0] = ar[0];
                    for (int i = 1; i < n; i++) {
                        minTilliFront[i] = Math.min(minTilliFront[i], ar[i]);
                        minTilliFront[i] = Math.min(minTilliFront[i - 1], minTilliFront[i]);
                    }
                    int minTilliBack[] = new int[n];
                    Arrays.fill(minTilliBack, Integer.MAX_VALUE);
                    minTilliBack[n - 1] =  ar[n - 1];
                    for (int i = n - 2; i >= 0; i--) {
                        minTilliBack[i] = Math.min(minTilliBack[i], ar[i]);
                        minTilliBack[i] = Math.min(minTilliBack[i + 1], minTilliBack[i]);
                    }
                    long res = Long.MIN_VALUE;
                    for (int i = 0; i < n; i++) {
                        long les = Math.max(minTilliBack[i], minTilliFront[i]);
                        res = Math.max(les, res);
                    }
                    out.write(Long.toString(res));
                }
            }
            out.newLine();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
