import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            long a = in.readLong();
            long b = in.readLong();
            if (b - a - 1 >= 10) {
                out.write(Integer.toString(0));
            }
            else {
                long product = 1l;
                for (long i = a + 1; i <= b; i++) {
                    product = product * i;
                    product %= 10;
                }
                out.write(Long.toString((product) % 10));
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
