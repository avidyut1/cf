import javax.print.attribute.standard.PrinterResolution;
import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            Vector<Integer> graph[] = new Vector[n + 1];
            for (int i = 0; i <= n; i++) {
                graph[i] = new Vector<>();
            }
            for (int i = 0; i < n - 1; i++) {
                int u = in.readInt();
                int v = in.readInt();
                graph[u].add(v);
                graph[v].add(u);
            }
            int col[] = new int[n + 1];
            dfs(col, graph, 1, 0);
            int k = -1;
            for (int i = 1; i < col.length; i++) {
                k = Math.max(k, col[i]);
            }
            out.write(Integer.toString(k));
            out.newLine();
            for (int i = 1; i < col.length; i++) {
                out.write(Integer.toString(col[i])+" ");
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void dfs(int col[], Vector<Integer> g[], int ver, int par) {
        int chosen = 1;
        for (int ch: g[ver]) {
            if (col[ch] == 0) {
                while(col[par] == chosen || col[ver] == chosen) {
                    chosen++;
                }
                col[ch] = chosen;
                chosen++;
                dfs(col, g, ch, ver);
            }
        }
    }
}
