import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            char c[] = (in.readLine()).toCharArray();
            char r = 'r'; char b = 'b';
            char poss[] = new char[n];
            boolean f = true;
            for (int i = 0; i < n; i++) {
                if (f) {
                    poss[i] = r;
                }
                else {
                    poss[i] = b;
                }
                f = !f;
            }
            int b2r = 0, r2b = 0;
            for (int i = 0; i < n; i++) {
                if (poss[i] == c[i]) {
                    continue;
                }
                if (c[i] == b && poss[i] == r) {
                    b2r++;
                }
                else if(c[i] == r && poss[i] == b) {
                    r2b++;
                }
            }
            int ans = Math.min(r2b, b2r);
            r2b -= ans; b2r -= ans;
            ans += r2b + b2r;
            poss = new char[n];
            f = false;
            for (int i = 0; i < n; i++) {
                if (f) {
                    poss[i] = r;
                }
                else {
                    poss[i] = b;
                }
                f = !f;
            }
            b2r = 0; r2b = 0;
            for (int i = 0; i < n; i++) {
                if (poss[i] == c[i]) {
                    continue;
                }
                if (c[i] == b && poss[i] == r) {
                    b2r++;
                }
                else if(c[i] == r && poss[i] == b) {
                    r2b++;
                }
            }
            int ans2 = Math.min(r2b, b2r);
            r2b -= ans2; b2r -= ans2;
            ans2 += r2b + b2r;
            System.out.println(Math.min(ans, ans2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
