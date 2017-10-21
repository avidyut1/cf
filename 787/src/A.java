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
            int c = in.readInt();
            int d = in.readInt();
            HashSet<Integer> hs = new HashSet<>();
            int MAX = (int)1e5 + 1;
            for (int i = 0; i < MAX; i++) {
                hs.add(b + a * i);
            }
            int ans = -1;
            for (int i = 0; i < MAX; i++) {
                if (hs.contains(d + c * i)) {
                    ans = d + c * i;
                    break;
                }
            }
            out.write(Integer.toString(ans));
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
