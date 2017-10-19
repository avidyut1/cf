import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int x = in.readInt();
            int ar[] = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = in.readInt();
            }
            final int MAX = (int)1e6 + 1;
            Vector<Integer> index[] = new Vector[MAX];
            for (int i = 0; i < MAX; i++) {
                index[i] = new Vector<Integer>();
            }
            for (int i = 0; i < n; i++) {
                index[ar[i]].add(i);
            }
            long ans = 0l;
            for (int i = 0; i < n; i++) {
                int res = ar[i] ^ x;
                int indb = Collections.binarySearch(index[res], i);
                if (indb < 0) {
                    indb = -1 - indb;
                    ans += (long)index[res].size() - indb;
                }
                else {
                    ans += (long)index[res].size() - indb - 1;
                }
            }
            System.out.println(ans);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
