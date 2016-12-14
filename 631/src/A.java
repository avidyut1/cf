import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int ans = in.readInt();
            for (int i = 0; i < n - 1; i++) {
                ans = ans | in.readInt();
            }
            int ans2 = in.readInt();
            for (int i = 0; i < n - 1; i++) {
                ans2 = ans2 | in.readInt();
            }
            System.out.println(ans + ans2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
