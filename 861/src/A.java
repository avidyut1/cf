import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            int k = in.readInt();
            long div = (long)Math.pow(10, k);
            for (int i = 1; i <= 100000; i++) {
                long res = (long)n * i;
                if (res % div == 0) {
                    out.write(Long.toString(res));
                    out.close();
                    return;
                }
            }
            out.write(Long.toString(n * div));
            out.newLine();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
