import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int h = in.readInt();
            int ans = 0;
            for (int i = 0; i < n; i++) {
                int a = in.readInt();
                if (a > h) {
                    ans+=2;
                }
                else
                    ans++;
            }
            System.out.println(ans);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
