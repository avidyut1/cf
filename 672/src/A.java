import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            String s = "";
            for (int i = 0; i < 10000; i++) {
                s += i;
            }
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            System.out.println(s.charAt(n));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
