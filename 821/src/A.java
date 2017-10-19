import java.io.*;
import java.util.*;
import java.math.*;

/**
 * created by asheshvidyut on 25/06/17
 **/
public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            int mat[][] = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    mat[i][j] = in.readInt();
                }
            }
            boolean ans = true;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(mat[i][j] != 1) {
                        boolean lans = false;
                        HashSet<Integer> row = new HashSet<Integer>();
                        for (int k = 0; k < n; k++) {
                            if(k == j) {
                                continue;
                            }
                            row.add(mat[i][k]);
                        }
                        for (int k = 0; k < n; k++) {
                            if (k == i) {
                                continue;
                            }
                            int rem = mat[i][j] - mat[k][j];
                            if (row.contains(rem)) {
                                lans = true;
                            }
                        }
                        if (!lans) {
                            ans = false;
                        }
                    }
                }
            }
            if (ans) {
                out.write("Yes");
            }
            else {
                out.write("No");
            }
            out.newLine();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
