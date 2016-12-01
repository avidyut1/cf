import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int ans = Integer.MAX_VALUE;
            String s = in.readLine();
            int ar[] = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = in.readInt();
            }
            for (int i = 0; i < s.length(); i++) {
                if (i + 1 < s.length()) {
                    char c = s.charAt(i);
                    char ct = s.charAt(i + 1);
                    if (c == 'R' && ct == 'L') {
                        int dis = ar[i + 1] - ar[i];
                        ans = Math.min(ans, dis / 2);
                    }
                }
            }
            if (ans == Integer.MAX_VALUE) {
                System.out.println(-1);
                return;
            }
            System.out.println(ans);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
