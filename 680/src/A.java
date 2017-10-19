import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int ar[] = new int[5];
            int ans = 0;
            for (int i = 0; i < 5; i++) {
                ar[i] = in.readInt();
                ans += ar[i];
            }
            Arrays.sort(ar);
            int lans = ans;
            for (int i = 0; i < 5; i++) {
                if (i + 1 < 5 && i + 2 < 5 && ar[i] == ar[i + 1] && ar[i + 1] == ar[i + 2]) {
                    lans = Math.min(lans, ans - (ar[i] + ar[i + 1] + ar[i + 2]));
                }
                else if(i + 1 < 5 && ar[i] == ar[i + 1]) {
                    lans = Math.min(lans, ans - (ar[i] + ar[i + 1]));
                }
            }
            System.out.println(lans);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
