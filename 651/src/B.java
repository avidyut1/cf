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
            if (n == 1) {
                System.out.println(0);
                return;
            }
            int ans = 0;
            for (int i = 0; i < n; i++) {
                int temp = ar[i];
                if (temp > 0) {
                    for (int j = i + 1; j < n; j++) {
                        if (ar[j] > temp) {
                            ans++;
                            temp = ar[j];
                            ar[j] = -7;
                        }
                    }
                }
            }
            System.out.println(ans);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
