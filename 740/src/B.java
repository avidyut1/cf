import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int m = in.readInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.readInt();
            }
            Pair[] all = new Pair[m];
            for (int i = 0; i < m; i++) {
                all[i] = new Pair(in.readInt() - 1, in.readInt() - 1);
            }
            Vector<Pair> sel = new Vector<Pair>();
            for (int i = 0; i < m; i++) {
                int sum = 0;
                for (int j = all[i].l; j <= all[i].r; j++) {
                    sum += a[j];
                }
                if (sum >= 0) {
                    sel.add(all[i]);
                }
            }
            HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
            Set<Integer> hs = new HashSet<Integer>();
            for (int i = 0; i < sel.size(); i++) {
                Pair p = sel.get(i);
                for (int j = p.l; j <= p.r; j++) {
                    hs.add(a[j]);
                    freq.put(a[j], freq.containsKey(a[j]) ? freq.get(a[j]) + 1: 1);
                }
            }
            int ans = 0;
            for (int num: hs) {
                ans += num * freq.get(num);
            }
            System.out.println(ans);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Pair{
    int l, r;
    public Pair(int l, int r) {
        this.l = l;this.r = r;
    }
}
