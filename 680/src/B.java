import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int c = in.readInt();
            int ar[] = new int[n + 1];
            for (int i = 1; i < n + 1; i++) {
                ar[i] = in.readInt();
            }
            int ans = 0;
            for (int d = 0; d <= n; d++) {
                if (c + d <= n && c - d >= 1) {
                    int tf = ar[c + d];
                    int ts = ar[c - d];
                    if (tf == 1 && ts == 1) {
                        if (c + d == c - d) {
                            ans++;
                        }
                        else
                            ans += 2;
                    }
                    else if (tf == 1 && ts == 0) {
                        ans += 0;
                    }
                    else if(tf == 0 && ts == 1) {
                        ans += 0;
                    }
                }
                else if (c + d <= n) {
                    if (ar[c + d] == 1) {
                        ans++;
                    }
                }
                else if(c - d >= 1) {
                    if (ar[c - d] == 1)
                        ans++;
                }
            }
            System.out.println(ans);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
