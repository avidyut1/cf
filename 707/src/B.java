import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int m = in.readInt();
            int k = in.readInt();
            Vector<Edge> g[] = new Vector[n];
            for (int i = 0; i < n; i++) {
                g[i] = new Vector<Edge>();
            }
            for (int i = 0; i < m; i++) {
                int u = in.readInt() - 1;
                int v = in.readInt() - 1;
                int w = in.readInt();
                g[u].add(new Edge(v, w));
                g[v].add(new Edge(u, w));
            }
            long dist[] = new long[n];
            Arrays.fill(dist, Long.MAX_VALUE);
            Set<Integer> supply = new HashSet<Integer>();
            for (int i = 0; i < k; i++) {
                int supplycity = in.readInt() - 1;
                dist[supplycity] = 0;
                supply.add(supplycity);
            }
            Queue<DistKey> pq = new PriorityQueue<DistKey>(1000000, new DistKey());
            for(int sup: supply) {
                pq.add(new DistKey(0, sup));
            }
            while(!pq.isEmpty()) {
                DistKey dk = pq.poll();
                for(Edge nei : g[dk.k]) {
                    if (dist[nei.to] > dist[dk.k] + nei.weight) {
                        dist[nei.to] = dist[dk.k] + nei.weight;
                        pq.add(new DistKey(dist[nei.to], nei.to));
                    }
                }
            }
            long ans = Long.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (supply.contains(i))
                    continue;
                ans = Math.min(ans, dist[i]);
            }
            if (ans == Long.MAX_VALUE) {
                System.out.println(-1);
            }
            else
                System.out.println(ans);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class DistKey implements Comparator<DistKey> {
    long d; int k;
    public DistKey(){

    }
    public DistKey(long d, int k){
        this.d = d;
        this.k = k;
    }
    @Override
    public int compare(DistKey a, DistKey b) {
        return (int)(a.d - b.d);
    }
}
class Edge{
    int to, weight;
    public Edge(int t, int w) {
        this.to = t;
        this.weight = w;
    }
}
