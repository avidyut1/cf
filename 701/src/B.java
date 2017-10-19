import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int m = in.readInt();
            long cells = (long)n * n;
            boolean row[] = new boolean[n + 1];
            boolean col[] = new boolean[n + 1];
            int colcount = 0, rowcount = 0;
            for (int i = 0; i < m; i++) {
                int r = in.readInt();
                int c = in.readInt();
                if (!row[r]) {
                    row[r] = true;
                    rowcount++;
                    cells -= n - colcount;
                }
                if(!col[c]) {
                    col[c] = true;
                    cells -= n - rowcount;
                    colcount++;
                }
                System.out.print(cells+" ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
