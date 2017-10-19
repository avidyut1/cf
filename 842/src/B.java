import java.io.*;
import java.util.*;
import java.math.*;

/**
 * created by asheshvidyut on 29/08/17
 **/
public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int r = in.readInt();
            int d = in.readInt();
            int n = in.readInt();
            int count = 0;
            for (int i = 0; i < n; i++) {
                int xi = in.readInt();
                int yi = in.readInt();
                int ri = in.readInt();
                double distance = Math.sqrt(Math.pow(xi, 2) + Math.pow(yi, 2));
                if (distance - ri >= (r - d) && distance + ri <= r) {
                    count++;
                }
            }
            out.write(Integer.toString(count));
            out.newLine();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
