import java.io.*;
import java.util.*;
import java.math.*;

/**
 * created by asheshvidyut on 10/04/17
 **/
public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            int m = in.readInt();
            int k = in.readInt();
            Set<Integer> holes = new HashSet<Integer>();
            for (int i = 0; i < m; i++) {
                holes.add(in.readInt());
            }
            int pos = 1;
            int uar[] = new int[k];
            int var[] = new int[k];
            for (int i = 0; i < k; i++) {
                int u = in.readInt();
                int v = in.readInt();
                uar[i] = u;
                var[i] = v;
            }
            for (int i = 0; i < k; i++) {
                int u = uar[i];
                int v = var[i];
                if (holes.contains(pos)) {
                    break;
                }
                if (u == pos) {
                    pos = v;
                }
                else if(v == pos) {
                    pos = u;
                }
            }
            out.write(Integer.toString(pos));
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
