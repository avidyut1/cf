import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.readInt();
            }
            int b[] = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = a[i] + (i + 1 < n? a[i + 1]: 0);
            }
            for (int i = 0; i < n; i++) {
                System.out.print(b[i]+" ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
