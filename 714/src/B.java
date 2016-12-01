import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int ar[] = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = in.readInt();
            }
            Arrays.sort(ar);
            if (n == 2) {
                System.out.println("YES");
                return;
            }
            int x = (ar[n - 1] - ar[0]) / 2;
            int val = ar[0] + x;
            boolean ans = true;
            for (int i = 0; i < n; i++) {
               if (ar[i] + x == val || ar[i] - x == val || ar[i] == val) {
                   continue;
               }
                ans = false;
            }
            if (ans) {
                System.out.println("YES");
            }
            else {
                x = (ar[n - 1] - ar[0]);
                val = ar[0] + x;
                ans = true;
                for (int i = 0; i < n; i++) {
                    if (ar[i] + x == val || ar[i] - x == val || ar[i] == val) {
                        continue;
                    }
                    ans = false;
                }
                if (ans ){
                    System.out.println("YES");
                }
                else
                System.out.println("NO");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
