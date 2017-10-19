import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            System.out.println((n / 3) * 2 + (n % 3 != 0 ? 1 : 0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
