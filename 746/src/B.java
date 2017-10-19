import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            char c[] = in.readLine().toCharArray();
            char res[] = c;
            char prev[] = res;
            for (int i = 0; i < n; i++) {
                res = go(res);
                if (Arrays.equals(res, c)) {
                    break;
                }
                prev = res;
            }
            for (int i = 0; i < n; i++) {
                System.out.print(prev[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static char[] go(char c[]) {
        int n = c.length;
        Vector<Character> vc = new Vector<Character>();
        for (int i = 0; i < n; i++) {
            vc.add(c[i]);
        }
        char res[] = new char[n];
        int ind = 0;
        while(!vc.isEmpty()) {
            int median = vc.size() % 2 == 0? vc.size() / 2 - 1:vc.size() / 2;
            res[ind++] = vc.get(median);
            vc.remove(median);
        }
        return res;
    }
}
