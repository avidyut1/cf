import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public void solve() throws IOException {
        InputReader in = new InputReader(System.in);
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = in.readInt();
        Map<String, Vector<Integer>> map = new HashMap<>();
        String f[] = new String[n];
        String s[] = new String[n];
        int usingSecond[] = new int[n];
        int mark[] = new int[n];
        for (int i = 0; i < n; i++) {
            String fs[] = in.readLine().split(" ");
            String first = fs[0];
            String second = fs[1];
            String name1 = first.substring(0, 3);
            String name2 = first.substring(0, 2) + second.charAt(0);
            f[i] = name1;
            s[i] = name2;
            Vector<Integer> v = new Vector<>();
            v.add(i);
            if (map.containsKey(f[i])) {
                map.get(f[i]).add(i);
            }
            else {
                map.put(f[i], v);
            }
        }
        int t = 0;
        // choosing second options because
        // first of all these are same
        // and for since we are selecting second for one
        // we cannot select first of any other because they are same
        for (int i = 0; i < n; i++) {
            if (map.get(f[i]).size() > 1) {
                mark[i] = 1;
                usingSecond[t++] = i;
            }
        }
        // now it second option selected of any index before
        // is equal to first option of some teams
        // we again se select second string for those
        // since we need distinct answer
        for (int h = 0; h < t; h++) {
            int indexUsingSecond = usingSecond[h];
            if (!map.containsKey(s[indexUsingSecond]))
                continue;
            for (int index: map.get(s[indexUsingSecond])) {
                if (mark[index] == 0) {
                    mark[index] = 1;
                    usingSecond[t++] = index;
                }
            }
        }
        String res[] = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = (mark[i] == 1) ? s[i] : f[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (res[i].equals(res[j])) {
                    out.write("NO");
                    out.close();
                    return;
                }
            }
        }
        out.write("YES");
        out.newLine();
        for (int i = 0; i < n; i++) {
            out.write(res[i]);
            out.newLine();
        }
        out.close();
    }
    public static void main(String args[]) {
        try {
            B b = new B();
            b.solve();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
