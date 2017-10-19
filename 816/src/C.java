import java.io.*;
import java.util.*;
import java.math.*;

/**
 * created by asheshvidyut on 17/06/17
 **/
public class C {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            int m = in.readInt();
            Vector<Integer> row = new Vector<Integer>();
            Vector<Integer> col = new Vector<Integer>();
            int minRow[] = new int[n];
            Arrays.fill(minRow, Integer.MAX_VALUE);
            int minCol[] = new int[m];
            Arrays.fill(minCol, Integer.MAX_VALUE);
            int mat[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    mat[i][j] = in.readInt();
                    minRow[i] = Math.min(mat[i][j], minRow[i]);
                    minCol[j] = Math.min(mat[i][j], minCol[j]);
                }
            }
            int rowSub[] = new int[n];
            int colSub[] = new int[m];
            boolean ans = true;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    mat[i][j] -= rowSub[i];
                    mat[i][j] -= colSub[j];
                    while (mat[i][j] > 0) {
                        boolean rowDel = true;
                        boolean colDel = true;
                        if (minRow[i] - 1 < 0)
                            rowDel = false;
                        if (minCol[j] - 1 < 0)
                            colDel = false;
                        if (rowDel && colDel) {
                            if (n < m) {
                                minRow[i]--;
                                rowSub[i]++;
                                row.add(i);
                                mat[i][j]--;
                            }
                            else {
                                minCol[j]--;
                                colSub[j]++;
                                col.add(j);
                                mat[i][j]--;
                            }
                        }
                        else if (rowDel) {
                            minRow[i]--;
                            rowSub[i]++;
                            row.add(i);
                            mat[i][j]--;
                        }
                        else if(colDel) {
                            minCol[j]--;
                            colSub[j]++;
                            col.add(j);
                            mat[i][j]--;
                        }
                        else {
                            ans = false;
                            break;
                        }
                        minRow[i] = Math.min(mat[i][j], minRow[i]);
                        minCol[j] = Math.min(mat[i][j], minCol[j]);
                    }
                }
            }
            boolean allzero = true;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (mat[i][j] != 0) {
                        allzero = false;
                    }
                }
            }
            if (ans && allzero) {
                out.write(Integer.toString(row.size() + col.size()));
                out.newLine();
                for(int id: row) {
                    out.write("row " + Integer.toString(id + 1));
                    out.newLine();
                }
                for (int id: col) {
                    out.write("col " + Integer.toString(id + 1));
                    out.newLine();
                }
            }
            else {
                out.write(Integer.toString(-1));
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
