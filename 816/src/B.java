import java.io.*;
import java.util.*;
import java.math.*;

/**
 * created by asheshvidyut on 17/06/17
 **/
public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            int k = in.readInt();
            int q = in.readInt();
            final int MAX = (int)2e5 + 1;
            int range[] = new int[MAX];
            for (int i = 0; i < n; i++) {
                int l = in.readInt();
                int r = in.readInt();
                range[l]++;
                if (r + 1 < MAX)
                    range[r + 1]--;
            }
            for (int i = 0; i < MAX; i++) {
                range[i] += (i - 1 >= 0 ? range[i - 1] : 0);
            }
            BIT bit = new BIT(MAX);
            for (int i = 0; i < MAX; i++) {
                if (range[i] >= k) {
                    bit.update(i, 1);
                }
            }
            for (int i = 0; i < q; i++) {
                int a = in.readInt();
                int b = in.readInt();
                out.write(Integer.toString(bit.query(b) - bit.query(a - 1)));
                out.newLine();
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class BIT{
    int bit[];
    public BIT(int n) {
        bit = new int[n];
    }
    public void update(int x, int val) {
        for (int i = x; i < bit.length; i+=(i & -i)) {
            bit[i] += val;
        }
    }
    public int query(int x) {
        int sum = 0;
        for (int i = x; i > 0; i-= (i & -i)) {
            sum += bit[i];
        }
        return sum;
    }
}
