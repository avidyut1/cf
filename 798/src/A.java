import java.io.*;
import java.util.*;
import java.math.*;

/**
 * created by asheshvidyut on 21/04/17
 **/
public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            char s[] = in.readLine().toCharArray();
            int countDiff = 0;
            int j = s.length - 1;
            int mid = s.length / 2;
            if (s.length % 2 == 0) {
                mid = (s.length / 2) - 1;
            }
            for (int i = 0; i <= mid ; i++) {
                if (s[i] == s[j]) {
                    j--;
                    continue;
                }
                countDiff++;
                j--;
            }
            if (countDiff == 0) {
                if (s.length % 2 == 0) {
                    out.write("NO");
                }
                else {
                    out.write("YES");
                }
            }
            else if (countDiff > 1) {
                out.write("NO");
            }
            else {
                out.write("YES");
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
