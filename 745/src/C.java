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
            int ark[] = new int[k];
            for (int i = 0; i < k; i++) {
                ark[i] = in.readInt() - 1;
            }
            Arrays.sort(ark);
            Vector<Integer> g[] = new Vector[n];
            for (int i = 0; i < n; i++) {
                g[i] = new Vector<Integer>();
            }
            for (int i = 0; i < m; i++) {
                int u = in.readInt() - 1;
                int v = in.readInt() - 1;
                g[u].add(v);
                g[v].add(u);
            }
            dfs(g);
            long ans = 0l;
            for (int i = 0; i < cc.size(); i++) {
                Vector<Integer> component = cc.get(i);
                for (int j = 0; j < component.size(); j++) {
                    for (int l = 0; l < component.size(); l++) {
                        if (j == l)
                            continue;
                        int vj = component.get(j);
                        int vl = component.get(l);
                        if (g[vj].contains(vl)){
                            continue;
                        }
                        else{
                            ans++;
                        }
                    }
                }
            }
            Queue<Integer> nongovconponent = new PriorityQueue<Integer>();
            Queue<Integer> govconponent = new PriorityQueue<Integer>(1000000, Collections.<Integer>reverseOrder());
            for (int i = 0; i < cc.size(); i++) {
                Vector<Integer> component = cc.get(i);
                boolean flag = false;
                for(int e: component) {
                    if (Arrays.binarySearch(ark, e) >= 0) {
                        flag = true;break;
                    }
                }
                if (flag) {
                    govconponent.add(component.size());
                }
                else{
                    nongovconponent.add(component.size());
                }
            }
            long totalnode = 0;
            while(!nongovconponent.isEmpty()) {
                int nodes = nongovconponent.poll();
                ans += totalnode * nodes;
                totalnode += nodes;
            }
            ans += totalnode * govconponent.poll();
            System.out.println(ans);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void dfs(Vector<Integer> g[]) {
        boolean v[] = new boolean[g.length];
        for (int i = 0; i < g.length; i++) {
            if (!v[i]) {
                cc.add(new Vector<Integer>());
                dfs_visit(i, cc.size() - 1, v, g);
            }
        }
    }
    public static void dfs_visit(int ver, int ind, boolean v[], Vector<Integer> g[]) {
        cc.get(ind).add(ver);
        v[ver] = true;
        for(int ch: g[ver]) {
            if (!v[ch])
             dfs_visit(ch, ind, v, g);
        }
    }
}
