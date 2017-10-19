import java.io.*;
import java.util.*;
import java.math.*;

public class C {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            Vector<Integer> ans = new Vector<>();
            for (int i = 1; i <= 1000; i++) {
                if (n - i <= 0) {
                    continue;
                }
                if (sod(n - i) == i) {
                    ans.add(n - i);
                }
            }
            out.write(Integer.toString(ans.size()));
            Collections.sort(ans);
            out.newLine();
            for (int res: ans) {
                out.write(Integer.toString(res));
                out.newLine();
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static int sod(int n) {
        String ns = Integer.toString(n);
        int ans = 0;
        for (int i = 0; i < ns.length(); i++) {
            ans += Integer.parseInt(Character.toString(ns.charAt(i)));
        }
        return ans;
    }
}
