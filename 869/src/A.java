import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            long f[] = new long[n];
            long s[] = new long[n];
            Set<Long> all = new HashSet<>();
            for (int i = 0; i < n; i++) {
                f[i] = in.readInt();
                all.add(f[i]);
            }
            for (int i = 0; i < n; i++) {
                s[i] = in.readInt();
                all.add(s[i]);
            }
            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (all.contains(f[i] ^ s[j])) {
                        count++;
                    }
                }
            }
            if (count % 2 == 0) {
                out.write("Karen");
            }
            else {
                out.write("Koyomi");
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
