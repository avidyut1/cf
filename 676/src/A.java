import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int ar[] = new int[n + 1];
            for (int i = 1; i < n + 1; i++) {
                ar[i] = in.readInt();
            }
            int min = Integer.MIN_VALUE;
            for (int i = 1; i <= n; i++) {
                if (ar[i] == n) {
                    min = Math.max(i - 1, min);
                    min = Math.max(n - i, min);
                    break;
                }
            }
            for (int i = 1; i <= n; i++) {
                if (ar[i] == 1) {
                    min = Math.max(i - 1, min);
                    min = Math.max(n - i, min);
                    break;
                }
            }
            System.out.println(min);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
