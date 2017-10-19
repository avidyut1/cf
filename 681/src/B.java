import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            for (long a = 0l; a <= 1000 ; a++) {
                for (long b = 0l; b <= 1000; b++) {
                    if (a * 1234567 + b * 123456 <= n)
                    if ((n - (a * 1234567 + b * 123456)) % 1234 == 0) {
                        System.out.println("YES");
                        return;
                    }
                }
            }
            System.out.println("NO");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
