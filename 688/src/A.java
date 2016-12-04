import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int d = in.readInt();
            char ar[][] = new char[d][n];
            for (int i = 0; i < d; i++) {
                ar[i] = in.readLine().toCharArray();
            }
            int ans = Integer.MIN_VALUE;
            for (int i = 0; i < d; i++) {
                int j = i;
                while(j < d && containsZero(ar[j])) {
                    j++;
                }
                ans = Math.max(ans, j - i);
                i = j;
            }
            System.out.println(ans);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static boolean containsZero(char c[]) {
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '0')
                return true;
        }
        return false;
    }
}
