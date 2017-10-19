import java.io.*;
import java.util.*;
import java.math.*;

/**
 * created by asheshvidyut on 04/05/17
 **/
public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            StringBuilder ans = new StringBuilder("aabb");
            StringBuilder res = new StringBuilder();
            int n = in.readInt();
            int times = n / ans.length();
            int rem = n % ans.length();
            for (int i = 0; i < times; i++) {
                res = res.append(ans);
            }
            res = res.append(ans.substring(0, rem));
            out.write(res.toString());
            out.newLine();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
