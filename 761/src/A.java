import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int a = in.readInt();
            int b = in.readInt();
            if (b == 0) {
                out.write("NO");
            }
            else if (Math.abs(a - b) == 1 || Math.abs(a - b) == 0) {
                out.write("YES");
            }
            else {
                out.write("NO");
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
