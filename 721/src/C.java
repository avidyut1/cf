import java.io.*;
import java.util.*;
import java.math.*;

public class C {
    static Vector<Integer> placesans = new Vector<Integer>();
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int m = in.readInt();
            int tt = in.readInt();
            Vector<Edge> gr[] = new Vector[n];
            for (int i = 0; i < n; i++) {
                gr[i] = new Vector<Edge>();
            }
            for (int i = 0; i < m; i++) {
                int f = in.readInt() - 1;
                int t = in.readInt() - 1;
                int ti = in.readInt();
                gr[f].add(new Edge(f, t, ti));
            }
            dfs(gr, tt);
            System.out.println(placesans.size());
            for (int ver: placesans) {
                System.out.print((ver+1) + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void dfs(Vector<Edge> g[], int tt){
        for (Edge e: g[0]) {
            Vector<Integer> vec = new Vector<Integer>();
            vec.add(0);
            dfs_visit(e.to, g, e.time, vec, tt);
        }
    }
    public static void dfs_visit(int ver, Vector<Edge> g[], int time, Vector<Integer> places, int tt) {
        int n = g.length;
        Vector<Integer> newv = new Vector<Integer>(places);
        newv.add(ver);
        if (ver == n - 1) {
            if (newv.size() > placesans.size() && time <= tt) {
                placesans = newv;
            }
            return;
        }
        for(Edge e: g[ver]) {
            dfs_visit(e.to, g, time + e.time, newv, tt);
        }
    }
}
class Edge {
    int from, to, time;
    public Edge(int f, int t, int ti) {
        this.from = f; this.to = t; this.time = ti;
    }
}
