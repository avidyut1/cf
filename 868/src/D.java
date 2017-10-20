import java.io.*;
import java.util.*;
import java.math.*;

//TODO
public class D {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            Vector<StringBuilder> s = new Vector<>();
            for (int i = 0; i < n; i++) {
                s.add(new StringBuilder(in.readLine()));
            }
            Vector<Vector<Integer>> indexes = new Vector<>();
            for (int i = 0; i < n; i++) {
                Vector<Integer> index = new Vector<>();
                index.add(i);
                indexes.add(index);
            }
            int q = in.readInt();
            for (int i = 0; i < q; i++) {
                int fir = in.readInt() - 1;
                int sec = in.readInt() - 1;
                StringBuilder res = buildString(indexes, fir, s, new StringBuilder()).append(buildString(indexes, sec, s, new StringBuilder()));
                out.write(Integer.toString(getAns(res)));
                Vector<Integer> index = new Vector<>();
                index.add(fir);
                index.add(sec);
                indexes.add(index);
                out.newLine();
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static StringBuilder buildString(Vector<Vector<Integer>> inds, int f, Vector<StringBuilder> strings, StringBuilder res) {
        if (f < strings.size()) {
            res.append(strings.get(f));
            return res;
        }
        for(int index: inds.get(f)) {
            res.append(buildString(inds, index, strings, new StringBuilder("")));
        }
        return res;
    }
    public static int getAns(StringBuilder s) {
        for (int k = 9; k >= 1; k--) {
            boolean contains = true;
            for (int i = 0; i < 1 << k; i++) {
                String bin = Integer.toBinaryString(i);
                while (bin.length() < k) {
                    bin = "0" + bin;
                }
                if (s.indexOf(bin) < 0) {
                    contains = false;
                    break;
                }
            }
            if (contains) {
                return k;
            }
        }
        return 0;
    }
}
