import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            String inp = in.readLine();
            int countsf = 0, countfs = 0;
            for (int i = 0; i < inp.length() - 1; i++) {
                if (inp.charAt(i) == 'S' && inp.charAt(i + 1) == 'F') {
                    countsf++;
                }
                else if (inp.charAt(i) == 'F' && inp.charAt(i + 1) == 'S') {
                    countfs++;
                }
            }
            if (countsf > countfs) {
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
