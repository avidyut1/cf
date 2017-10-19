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
            int z = in.readInt();
            Set<Integer> hs = new HashSet<Integer>();
            for (int i = n; i <= z; i += n) {
                hs.add(i);
            }
            int ans = 0;
            for (int i = m; i <= z; i += m) {
                if (hs.contains(i)) {
                    ans++;
                }
            }
            out.write(Integer.toString(ans));
            out.newLine();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
