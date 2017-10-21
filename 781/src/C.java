import java.io.*;
import java.util.*;
import java.math.*;

public class C {
    Vector<Vector<Integer>> path;
    public void solve() throws IOException {
        InputReader in = new InputReader(System.in);
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        path = new Vector<>();
        int n = in.readInt();
        int m = in.readInt();
        int k = in.readInt();
        Vector<Integer> graph[] = new Vector[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new Vector<>();
        }
        for (int i = 0; i < m; i++) {
            int u = in.readInt() - 1;
            int v = in.readInt() - 1;
            graph[u].add(v);
            graph[v].add(u);
        }
        boolean vis[] = new boolean[n];
        int indexOfPath = -1;
        for (int i = 0; i < k; i++) {
            indexOfPath++;
            path.add(new Vector<>());
            while(i < n && vis[i]) {
                i++;
            }
            if (i < n) {
                dfs2(graph, i, vis, indexOfPath, -1);
            }
        }
        Vector<Integer> res = new Vector<>();
        res = path.get(0);
//        for(int ver: res) {
//            out.write(Integer.toString(ver + 1)+" ");
//        }
//        out.newLine();
        int oneseg = (int)Math.ceil(2 * (double)n / k);
        int pointer = 0;
        for (int i = 0; i < k; i++) {
            int counter = 0;
            for (int j = pointer; j < Math.min(pointer + oneseg, res.size()); j++) {
                counter++;
            }
            if (counter == 0) {
                out.write("1 1");
                out.newLine();
                continue;
            }
            out.write(Integer.toString(counter) + " ");
            for (int j = pointer; j < Math.min(pointer + oneseg, res.size()); j++) {
                out.write(Integer.toString(res.get(j) + 1)+" ");
            }
            out.newLine();
            pointer += counter;
        }
        out.close();
    }
    private void dfs2(Vector<Integer> g[], int ver, boolean v[], int indexPath, int parent) {
        path.get(indexPath).add(ver);
        v[ver] = true;
        for (int ch: g[ver]) {
            if (!v[ch]) {
                dfs2(g, ch, v, indexPath, ver);
            }
        }
        if (parent != -1) {
            path.get(indexPath).add(parent);
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
