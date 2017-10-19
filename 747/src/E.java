import java.io.*;
import java.util.*;
import java.math.*;

public class E {
    static Vector<String> d[] = new Vector[1000001];
    static int depth = Integer.MIN_VALUE;
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            String s[] = in.readLine().split(",");
            for (int i = 0; i < d.length; i++) {
                d[i] = new Vector<String>();
            }
            boolean v[] = new boolean[s.length];
            for (int i = 0; i < s.length; i+=2) {
                recurse(0, i, s, v);
            }
            out.write(Integer.toString(depth));
            out.newLine();
            for (int i = 0; i <= depth; i++) {
                for (String val: d[i]) {
                    out.write(val+" ");
                }
                out.newLine();
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void recurse(int cd, int ind, String s[], boolean v[]) {
        if (ind >= s.length) {
            return;
        }
        if (v[ind]) {
            return;
        }
        v[ind] = true;
        depth = Math.max(depth, cd);
        d[cd].add(s[ind]);
        for (int i = 1; i <= Integer.parseInt(s[ind + 1]); i++) {
            recurse(cd + 1, ind + 2 * i, s, v);
        }
    }
}
