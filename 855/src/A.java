import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            Set<String> hs = new HashSet<>();
            for (int i = 0; i < n; i++) {
                String s = in.readLine();
                if (hs.contains(s)) {
                    out.write("YES");
                }
                else {
                    out.write("NO");
                }
                hs.add(s);
                out.newLine();
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
