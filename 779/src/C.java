import java.io.*;
import java.util.*;
import java.math.*;

public class C {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            int k = in.readInt();
            int b[] = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = in.readInt();
            }
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.readInt();
            }
            Vector<DiffIndex> di = new Vector<DiffIndex>();
            for (int i = 0; i < n; i++) {
                di.add(new DiffIndex(a[i] - b[i], i));
            }
            Collections.sort(di);
            long ans = 0l;
            int i = 0;
            for (; i < n; i++) {
                DiffIndex d = di.get(i);
                if (d.diff < 0 && i >= k) {
                    break;
                }
                ans += b[d.ind];
            }
            for (int j = i; j < n; j++) {
                DiffIndex d = di.get(j);
                ans += a[d.ind];
            }
            out.write(Long.toString(ans));
            out.newLine();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class DiffIndex implements Comparable<DiffIndex> {
    public int diff, ind;
    public DiffIndex(int d, int ind) {
        this.diff = d;
        this.ind = ind;
    }
    public int compareTo(DiffIndex di) {
        if (this.diff > di.diff) {
            return -1;
        }
        else
            return 1;
    }
}
