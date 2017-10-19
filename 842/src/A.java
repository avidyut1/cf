import java.io.*;
import java.util.*;
import java.math.*;

/**
 * created by asheshvidyut on 29/08/17
 **/
public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int l = in.readInt();
            int r = in.readInt();
            int x = in.readInt();
            int y = in.readInt();
            int k = in.readInt();
            boolean ans = false;
            for (int i = l; i <= r; i++) {
                if (i % k == 0) {
                    int cost = i / k;
                    if (cost >= x && cost <= y) {
                        ans = true;
                    }
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
