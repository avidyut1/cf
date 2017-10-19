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
            boolean ans = true;
            for (int i = 0; i < n; i++) {
                if (ar[i] % 2 != 0) {
                    if (i + 1 < n && ar[i + 1] > 0) {
                        ar[i + 1] -= 1;
                        ar[i] -= 1;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                if (ar[i] % 2 == 0) {
                    ar[i] = 0;
                }
                else{
                    ans = false;
                }
            }
            if (ans)
                System.out.println("YES");
            else
                System.out.println("NO");
//            System.out.println(Arrays.toString(ar));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
