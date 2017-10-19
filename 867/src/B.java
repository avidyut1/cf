import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int ways = in.readInt();
            int max = (int)1e6 + 1;
            int dp[][] = new int[max][10];
            for (int i = 1; i < max; i++) {

            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public int count(Vector<Integer> S, int n){
        int m = S.size();
        int table[] = new int[n+1];
        table[0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = S.get(i); j <= n; j++) {
                table[j] += table[j - S.get(i)];
            }
        }
        return table[n];
    }
}
