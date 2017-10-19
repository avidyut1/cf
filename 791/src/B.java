import java.io.*;
import java.util.*;
import java.math.*;

/**
 * created by asheshvidyut on 18/03/17
 **/
public class B {
    static boolean ans = true;
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            int m = in.readInt();
            Vector<Integer> graph[] = new Vector[n];
            for (int i = 0; i < n; i++) {
                graph[i] = new Vector<Integer>();
            }
            for (int i = 0; i < m; i++) {
                int u = in.readInt() - 1;
                int v = in.readInt() - 1;
                graph[u].add(v);
                graph[v].add(u);
            }
            boolean v[] = new boolean[n];
            dfs(graph, n, v);
            if (ans) {
                out.write("YES");
            }
            else {
                out.write("NO");
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void dfs(Vector<Integer> g[], int n, boolean v[]) {
        for (int i = 0; i < n; i++) {
            if (!v[i]) {
                dfs_visit(g, n, v, i);
            }
        }
    }
    public static void dfs_visit(Vector<Integer> g[], int n, boolean v[], int ver) {
        if (v[ver]) {
            return;
        }
        v[ver] = true;
        for (Integer ch: g[ver]) {
            for (Integer grandCh: g[ch]) {
                if (grandCh.equals(ver)) {
                    continue;
                }
                if (!g[grandCh].contains(new Integer(ver))) {
                    ans = false;
                    return;
                }
            }
        }
    }
}
