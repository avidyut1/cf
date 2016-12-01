import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            String a = "I hate";
            String b =  "I love";
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            String res = "";
            boolean f = true;
            for (int i = 0; i < n; i++) {
                if (f) {
                    res += a;
                }
                else {
                    res += b;
                }
                if (i == n - 1) {
                    res += " it";
                }
                else
                    res += " that ";
                f = !f;
            }
            System.out.println(res);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
