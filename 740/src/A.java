import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int a = in.readInt();
            int b = in.readInt();
            int c = in.readInt();
            int k = 0;
            while((n + k) % 4 != 0) {
                k++;
            }
            long ans = (long)k * a;
            long lans = 0l;
            int dk = k;

            System.out.println(Math.min(lans, ans));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
