import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            int ar[] = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                ar[i] = in.readInt();
            }
            int revar[] = new int[n + 1];
            int j = n;
            for (int i = 1; i < n + 1; i++) {
                revar[i] = ar[j--];
            }
            int res[] = new int[n + 1];
            if (n % 2 != 0) {
                for (int i = 1; i <= n; i++) {
                    if (i % 2 == 0) {
                        res[i] = ar[i];
                    }
                    else {
                        res[i] = revar[i];
                    }
                }
            }
            else {
                boolean vis[] = new boolean[n + 1];
                for (int i = 1; i < n + 1; i++) {
                    if (i % 2 == 0) {
                        int ind = i;
                        if (vis[ind]) {
                            ind = n - i + 1;
                        }
                        vis[ind] = true;
                        res[i] = ar[ind];
                    }
                    else {
                        int ind = n - i + 1;
                        if (vis[ind]) {
                            ind = i;
                        }
                        vis[ind] = true;
                        res[i] = ar[ind];
                    }
                }
            }
            for (int i = 1; i < n + 1; i++) {
                out.write(Integer.toString(res[i])+" ");
            }
            out.newLine();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}