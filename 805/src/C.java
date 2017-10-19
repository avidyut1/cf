import java.io.*;
import java.util.*;
import java.math.*;

/**
 * created by asheshvidyut on 04/05/17
 **/
public class C {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            if (n % 2 != 0) {
                n++;
            }
            int i = 1;
            int j = n;
            long ans = 0L;
            while(i != j - 1) {
                i++;
                ans += (i + j) % (n + 1);
                j-=1;
            }
            out.write(Long.toString(ans));
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
