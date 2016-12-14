import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            boolean min[] = new boolean[91];
            for (int i = 0; i < n; i++) {
                min[in.readInt()] = true;
            }
            int countb = 0;
            for (int i = 1; i <= 90; i++) {
                if (!min[i]) {
                    countb++;
                }
                else if (min[i]) {
                    countb = 0;
                }
                if (countb == 15) {
                    System.out.println(i);
                    return;
                }
            }
            System.out.println(90);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
