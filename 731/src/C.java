import java.io.*;
import java.util.*;
import java.math.*;

public class C {
    static Vector<Vector<Integer>> cc = new Vector<Vector<Integer>>();
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int m = in.readInt();
            int k = in.readInt();
            int c[] = new int[n];
            for (int i = 0; i < n; i++) {
                c[i] = in.readInt();
            }
            Vector<Integer> graph[] = new Vector[n];
            for (int i = 0; i < n; i++) {
                graph[i] = new Vector<Integer>();
            }
            for (int i = 0; i < m; i++) {
                int l = in.readInt() - 1;
                int r = in.readInt() - 1;
                graph[l].add(r);
                graph[r].add(l);
            }
            dfs(graph);
            int ans = 0;
            for (Vector<Integer> ce : cc) {
                HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
                Set<Integer> keys = new HashSet<Integer>();
                for (int v : ce) {
                    hm.put(c[v], hm.containsKey(c[v]) ? hm.get(c[v]) + 1 : 1);
                    keys.add(c[v]);
                }
                int maxc = -1;
                for (int key: keys) {
                    maxc = Math.max(maxc, hm.get(key));
                }
                ans += (ce.size() - maxc);
            }
            System.out.println(ans);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void dfs(Vector<Integer> g[]){
        boolean v[] = new boolean[g.length];
        for (int i = 0; i < g.length; i++) {
            if (!v[i]) {
                cc.add(new Vector<Integer>());
                dfs_visit(i, g, v);
            }
        }
    }
    public static void dfs_visit(int i, Vector<Integer> g[], boolean v[]) {
        if (v[i]) {
            return;
        }
        v[i] = true;
        cc.get(cc.size() - 1).add(i);
        for (int ver : g[i]){
            if (!v[ver]) {
                dfs_visit(ver, g, v);
            }
        }
    }
}