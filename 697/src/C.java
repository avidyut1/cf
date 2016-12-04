import java.io.*;
import java.util.*;
import java.math.*;

public class C {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            Map<Edge, Integer> map = new HashMap<Edge, Integer>();
            int q = in.readInt();
            for (int i = 0; i < q; i++) {
                int type = in.readInt();
                int u = in.readInt();
                int v = in.readInt();
                if(type == 1) {
                    int w = in.readInt();
                    int lca = lca(u, v);
                    int prev = u;
                    while(u != lca) {
                        u /= 2;
                        map.put(new Edge(u, prev), map.containsKey(new Edge(u, prev)) ? map.get(new Edge(u, prev)) + w: w);
                        prev = u;
                    }
                    prev = v;
                    while(v != lca) {
                        v /= 2;
                        map.put(new Edge(v, prev), map.containsKey(new Edge(v, prev)) ? map.get(new Edge(v, prev)) + w: w);
                        prev = v;
                    }
                }
                else{
                    int ans = 0;
                    int lca = lca(u, v);
                    int prev = u;
                    while(u != lca) {
                        u/=2;
                        ans += map.containsKey(new Edge(u, prev)) ? map.get(new Edge(u, prev)) : 0;
                        prev = u;
                    }
                    prev = v;
                    while(v != lca) {
                        v/=2;
                        ans += map.containsKey(new Edge(v, prev)) ? map.get(new Edge(v, prev)) : 0;
                        prev = v;
                    }
                    System.out.println(ans);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static int lca(int u, int v) {
        Set<Integer> hs = new HashSet<Integer>();
        while(u != 0) {
            hs.add(u);
            u /= 2;
        }
        while(v != 0) {
            if (hs.contains(v)) {
                return v;
            }
            v /= 2;
        }
        return 1;
    }
}
class Edge{
    int f, to;
    public Edge(int f, int t){
        this.f = f;
        this.to = t;
    }
    public String toString(){
        return this.f+" "+this.to;
    }
    public boolean equals(Object sec) {
        Edge secob = (Edge)sec;
        if (this.to == secob.to && this.f == secob.f) {
            return true;
        }
        if (this.to == secob.f && this.f == secob.to)
            return true;
        else return false;
    }
    @Override
    public int hashCode() {
        return this.f + this.to;
    }
}
