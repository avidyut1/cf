import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int a = in.readInt();
            int b = in.readInt();
            int n = in.readInt();
            double mintime = Double.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int s = in.readInt();
                int t = in.readInt();
                double dist = Math.sqrt(Math.pow(s - a, 2) + Math.pow(b - t, 2));
                int v = in.readInt();
                double time = dist / v;
                mintime = Math.min(mintime, time);
            }
            System.out.println(mintime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
