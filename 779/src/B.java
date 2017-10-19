import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            long n = in.readLong();
            int k = in.readInt();
            long val = (long)Math.pow(10, k);
            String s = n + "";
            if (n % val == 0) {
                out.write(Integer.toString(0));
                out.newLine();
                out.close();
                return;
            }
            int ans = 0;
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) != '0') {
                    s = s.substring(0, i) + s.substring(i + 1);
                    int nl = (Long.parseLong(s) + "").length();
                    ans += Math.abs(nl - s.length()) + 1;
                    if (Long.parseLong(s) % val == 0) {
                        out.write(Integer.toString(ans));
                        out.newLine();
                        out.close();
                        return;
                    }
                }
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
