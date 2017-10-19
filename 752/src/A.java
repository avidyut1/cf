import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            int m = in.readInt();
            int k = in.readInt();
            int flane[][] = new int[m][2];
            int id = 1;
            for (int i = 0; i < m; i++) {
                flane[i][0] = id;
                flane[i][1] = id + 1;
                id += 2;
            }
            int diff = id - flane[0][0];
            for (int i = 0; i < m; i++) {
                if ((k - flane[i][0]) % diff == 0) {
                    int laneans = (k - flane[i][0]) / diff + 1;
                    out.write(Integer.toString(laneans)+" "+(i + 1)+" L");
                    out.close();
                    return;
                }
                if ((k - flane[i][1]) % diff == 0) {
                    int laneans = (k - flane[i][1]) / diff + 1;
                    out.write(Integer.toString(laneans) + " "+(i + 1)+" R");
                    out.close();
                    return;
                }
            }
            System.out.println();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
