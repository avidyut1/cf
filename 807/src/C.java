import java.io.*;
import java.util.*;
import java.math.*;

/**
 * created by asheshvidyut on 07/05/17
 **/
public class C {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int tc = in.readInt();
            for (int t = 0; t < tc; t++) {
                long x = in.readLong();
                long y = in.readLong();
                long p = in.readLong();
                long q = in.readLong();
                long factor = y / q;
                p *= factor;
                q *= factor;
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
