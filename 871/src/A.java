import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int rem[] = new int[]{0, 9, 6, 15};
            int add[] = new int[]{0, 1, 1, 2};
            int tc = in.readInt();
            for (int t = 0; t < tc; t++) {
                int n = in.readInt();
                if (n < 4) {
                    out.write(Integer.toString(-1));
                }
                else {
                    int div = n / 4;
                    int mod = n % 4;
                    if (n < rem[mod]) {
                        out.write(Integer.toString(-1));
                    }
                    else {
                        int ans = (n - rem[mod]) / 4 + add[mod];
                        out.write(Integer.toString(ans));
                    }
                }
                out.newLine();
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
