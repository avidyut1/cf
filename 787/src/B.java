import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            int m = in.readInt();
            int ar[][] = new int[m][];
            HashSet<Integer> hs[] = new HashSet[m];
            for (int i = 0; i < m; i++) {
                hs[i] = new HashSet<>();
                int k = in.readInt();
                ar[i] = new int[k];
                for (int j = 0; j < k; j++) {
                    ar[i][j] = in.readInt();
                    hs[i].add(ar[i][j]);
                }
            }
            boolean ans = false;
            for (int i = 0; i < m; i++) {
                boolean lans = false;
                for (int j : hs[i]) {
                    if (hs[i].contains(-1 * j)) {
                        lans = true;
                        continue;
                    }
                }
                if(!lans) {
                    ans = true;
                    break;
                }
            }
            if (ans) {
                out.write("YES");
            }
            else {
                out.write("NO");
            }
            out.newLine();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
