import java.io.*;
import java.util.*;
import java.math.*;

public class C {
    public void solve() {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            int m = in.readInt();
            int ar[][] = new int[n + 1][];
            for (int i = 1; i <= n; i++) {
                int ele = in.readInt();
                ar[i] = new int[ele];
                for (int j = 0; j < ele; j++) {
                    ar[i][j] = in.readInt();
                }
            }
            Vector<Integer> g[] = new Vector[m + 1];
            for (int i = 0; i <= m; i++) {
                g[i] = new Vector<>();
            }
            boolean cap[] = new boolean[m + 1];
            for (int i = 2; i <= n; i++) {
                int first[] = ar[i - 1];
                int second[] = ar[i];
                for (int j = 0; j < Math.min(first.length, second.length); j++) {
                    if (first[j] != second[j]) {
                        if (first[j] > second[j]) {
                            cap[first[j]] = true;
                            break;
                        }
                        if (first[j] < second[j]) {
                            g[second[j]].add(first[j]);
                            break;
                        }
                    }
                }
            }
            boolean vis[] = new boolean[m + 1];
            for (int i = 0; i <= m; i++) {
                if (!vis[i] && cap[i]) {
                    dfs(vis, g, i, cap);
                }
            }
            boolean ans = true;
            for (int i = 2; i <= n; i++) {
                int first[] = ar[i - 1];
                int second[] = ar[i];
                boolean diff = false;
                for (int j = 0; j < Math.min(first.length, second.length); j++) {
                    if (first[j] != second[j]) {
                        diff = true;
                        if (cap[first[j]]) {
                            if (cap[second[j]]) {
                                if (first[j] > second[j]) {
                                    ans = false;
                                    break;
                                }
                            }
                        }
                        else if (cap[second[j]]) {
                            ans = false;
                            break;
                        }
                        else if (first[j] > second[j]) {
                            ans = false;
                            break;
                        }
                        break;
                    }
                }
                if (!diff) {
                    if (first.length > second.length) {
                        ans = false;
                        break;
                    }
                }
            }
            if (ans) {
                out.write("Yes");
                out.newLine();
                int count = 0;
                for (int i = 0; i <= m; i++) {
                    if (cap[i]) {
                        count++;
                    }
                }
                out.write(Integer.toString(count));
                out.newLine();
                for (int i = 0; i <= m; i++) {
                    if (cap[i])
                        out.write(Integer.toString(i)+" ");
                }
            }
            else {
                out.write("No");
            }
            out.newLine();
            out.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void dfs(boolean v[], Vector<Integer> g[], int ver, boolean cap[]) {
        v[ver] = true;
        cap[ver] = true;
        for (int ch: g[ver]) {
            if (!v[ch]) {
                dfs(v, g, ch, cap);
            }
        }
    }
    public static void main(String args[]) {
        try {
            C c = new C();
            c.solve();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
