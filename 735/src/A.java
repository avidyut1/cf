import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    static boolean ans = false;
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int k = in.readInt();
            char c[] = (in.readLine()).toCharArray();
            boolean v[] = new boolean[c.length];
            int s = -1;
            for (int i = 0; i < c.length; i++) {
                if (c[i] == 'G') {
                    s = i;
                    v[i] = true;
                    break;
                }
            }
            recurse(s - k, c, k, v);
            recurse(s + k, c, k, v);
            if(ans)
                System.out.println("YES");
            else
                System.out.println("NO");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void recurse(int ind, char c[], int k, boolean v[]) {
        if (ind < 0 || ind >= c.length) {
            return;
        }
        if (v[ind]) {
            return;
        }
        if (c[ind] == 'T') {
            ans = true;
        }
        v[ind] = true;
        if (c[ind] == '#') {
            return;
        }
        recurse(ind + k, c, k, v);
        recurse(ind - k, c, k, v);
        return;
    }
}
