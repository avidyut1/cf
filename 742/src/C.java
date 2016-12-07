import java.io.*;
import java.util.*;
import java.math.*;

public class C {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int ar[] = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                ar[i] = in.readInt();
            }
            boolean found[] = new boolean[n + 1];
            for (int i = 1; i < n + 1; i++) {
                found[ar[i]] = true;
            }
            for (int i = 1; i < n + 1; i++) {
                if (!found[i]) {
                    System.out.println(-1);
                    return;
                }
            }
            boolean vis[] = new boolean[n + 1];
            Vector<Integer> posans = new Vector<Integer>();
            for (int i = 1; i <= n; i++) {
                if (!vis[i]) {
                    int ti = 1;
                    int next = ar[i];
                    vis[i] = true;
                    vis[next] = true;
                    while(next != i) {
                        ti++;
                        next = ar[next];
                        vis[next] = true;
                    }
                    if (ti % 2 == 0) {
                        ti /= 2;
                    }
                    posans.add(ti);
                }
            }
            //lcm of posans vector is our answer
            int ans = posans.get(0);
            for (int i = 1; i < posans.size(); i++) {
                ans = (ans * posans.get(i)) / gcd(ans, posans.get(i));
            }
            System.out.println(ans);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static int gcd(int a, int b){
        if (a == 0 || b == 0) {
            return a + b;
        }
        return gcd(b, a % b);
    }
}
