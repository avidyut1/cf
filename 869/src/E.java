import java.io.*;
import java.util.*;
import java.math.*;

//TODO
public class E {
    public void solve() throws IOException{
        InputReader in = new InputReader(System.in);
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = in.readInt();
        int m = in.readInt();
        int q = in.readInt();
        Vector<Pair> row[] = new Vector[n + 1];
        Vector<Pair> col[] = new Vector[m + 1];
        for (int i = 0; i <= n; i++) {
            row[i] = new Vector<>();
        }
        for (int i = 0; i <= m; i++) {
            col[i] = new Vector<>();
        }
        for (int i = 0; i < q; i++) {
            int type = in.readInt();
            int r1 = in.readInt();
            int c1 = in.readInt();
            int r2 = in.readInt();
            int c2 = in.readInt();
            if (type == 1) {
                row[r1].add(new Pair(c1, c2));
                row[r2].add(new Pair(c1, c2));
                col[c1].add(new Pair(r1, r2));
                col[c2].add(new Pair(r1, r2));
            }
            else if (type == 2){
                row[r1].remove(new Pair(c1, c2));
                row[r2].remove(new Pair(c1, c2));
                col[c1].remove(new Pair(r1, r2));
                col[c2].remove(new Pair(r1, r2));
            }
            else {
                int maxr = Math.max(r1, r2);
                int maxc = Math.max(r1, r2);
                int minr = r1 + r2 - maxr;
                int minc = c1 + c2 - maxc;
                boolean barirer = false;
                while(minc != maxc) {

                    minc++;
                }
            }
        }
        out.close();
    }
    public static void main(String args[]) {
        try {
            E e = new E();
            e.solve();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private class SegmentTree{
        Map<Pair, Integer> G = new HashMap<>();
        int n, id; int pcounter;
        SegmentTreeNode root;
        int MAX = (int)3e4 + 1;
        public void insert(int l, int u, int r, int d) {
            id = pcounter++;
            G.put(new Pair(l, u), id);
            root = insert(root, l, u, r, d, 0, MAX);
        }
        private SegmentTreeNode insert(SegmentTreeNode node, int l, int u, int r, int d, int nl, int nr) {
            if (node == null) {
                node = new SegmentTreeNode(nl, nr);
            }
            if (nl <= l && nr <= r){
                node.data.add(new Data(u, d, id));
            }
            else {
                int mid = (nl + nr) >> 1;
                node.left = insert(node.left, l, u, r, d, nl, mid - 1);
                node.right = insert(node.right, l, u, r, d, mid, r);
            }
            return node;
        }
        public void delete(int l, int u, int r, int d){
            int id = G.get(new Pair(l, u));
            G.remove(new Pair(l, u));
            delete(root, l, u, r, d, id);
        }
        private void delete(SegmentTreeNode node, int l, int u, int r, int d, int id) {
            if (node == null) {
                return;
            }
            if (l <= node.l && node.r <= r) {
                for (Data dataEle: node.data) {
                    if (dataEle.id == id) {
                        node.data.remove(dataEle);
                        break;
                    }
                }
                return;
            }
            delete(node.left, l, u, r, d, id);
            delete(node.right, l, u, r, d, id);
        }
        public int ask(int l, int u) {
            return ask(root, l, u);
        }
        private int ask(SegmentTreeNode node, int l, int u) {
            if (node == null) {
                return -7;
            }
            return -1;
        }
    }
    private class SegmentTreeNode{
        int l, r;
        public Vector<Data> data;
        public SegmentTreeNode left, right;

        public SegmentTreeNode(int l, int r) {
            this.l = l;
            this.r = r;
            this.data = new Vector<>();
        }
    }
    private class Data {
        int u, d, id;

        public Data(int u, int d, int id) {
            this.u = u;
            this.d = d;
            this.id = id;
        }
    }
    private class Pair {
        int x; int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (x != pair.x) return false;
            return y == pair.y;
        }

        @Override
        public int hashCode() {
            int result = x;
            result = 31 * result + y;
            return result;
        }
    }
}
