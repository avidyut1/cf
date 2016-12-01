import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int a = in.readInt();
            int b = in.readInt();
            int c = in.readInt();
            int ar[] = new int[]{a, b, c};
            Arrays.sort(ar);
            System.out.println(ar[2] - ar[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
