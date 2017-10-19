import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            int ar[] = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                ar[i] = in.readInt();
                sum += ar[i];
            }
            if (sum == 0) {
                if (n == 1) {
                    out.write("NO");
                }
                else {
                    int indnonzero = -1;
                    for (int i = 0; i < n; i++) {
                        if(ar[i] != 0) {
                            indnonzero = i;
                            break;
                        }
                    }
                    if (indnonzero == -1) {
                        out.write("NO");
                        out.close();
                        return;
                    }
                    out.write("YES");
                    out.newLine();
                    out.write(Integer.toString(2));
                    out.newLine();
                    out.write("1 "+(indnonzero + 1));
                    out.newLine();
                    out.write((indnonzero+2) + " " + n);
                    out.newLine();
                    out.close();
                }
            }
            else {
                out.write("YES");
                out.newLine();
                out.write(Integer.toString(1));
                out.newLine();
                out.write("1 "+n);
                out.newLine();
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
