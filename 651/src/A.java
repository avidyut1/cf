import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int a1 = in.readInt();
            int a2 = in.readInt();
            int min = Math.min(a1, a2);
            int max = Math.max(a1, a2);
            int ans = 0;
            if (min == 1 && max == 1) {
                System.out.println("0");
                return;
            }
            boolean c1 = true;
            while(true) {
                if (min <= 0 || max <= 0) {
                    break;
                }
                if (c1) {
                    min += 1;
                    max -= 2;
                }
                else {
                    min -= 2;
                    max += 1;
                }
                if (min <= 2) {
                    c1 = true;
                }
                if (max <= 2) {
                    c1 = false;
                }
                ans++;
            }
            System.out.println(ans);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
