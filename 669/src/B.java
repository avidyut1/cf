import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            char s[] = in.readLine().toCharArray();
            int ar[] = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = in.readInt();
            }
            boolean v[] = new boolean[n];
            int ind = 0;
            String ans = "INFINITE";
            while(true) {
                if (v[ind]) {
                    break;
                }
                v[ind] = true;
                if (s[ind] == '>') {
                    ind = ind + ar[ind];
                }
                else {
                    ind = ind - ar[ind];
                }
                if (ind < 0 || ind >= n) {
                    ans = "FINITE";
                    break;
                }
            }
            System.out.println(ans);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
