import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            IndexVal ar[] = new IndexVal[n];
            for (int i = 0; i < n; i++) {
                ar[i] = new IndexVal(i + 1, in.readInt());
            }
            Arrays.sort(ar);
            int j = n - 1;
            for (int i = 0; i < n/ 2; i++) {
                System.out.println(ar[i].index+" "+ar[j--].index);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class IndexVal implements Comparable<IndexVal>{
    int index, val;
    public IndexVal(int i, int v) {
        this.index = i;
        this.val = v;
    }
    @Override
    public int compareTo(IndexVal that) {
        return this.val - that.val;
    }
}
