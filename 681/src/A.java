import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            for (int i = 0; i < n; i++) {
                String inapr[] = (in.readLine()).split(" ");
                int prev = Integer.parseInt(inapr[1]);
                int curr = Integer.parseInt(inapr[2]);
                if (prev >= 2400 && curr > prev) {
                    System.out.println("YES");
                    return;
                }
            }
            System.out.println("NO");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
