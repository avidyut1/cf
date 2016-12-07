import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            if (n == 0) {
                System.out.println(1);
                return;
            }
            n = n % 4;
            if (n == 0) {
                System.out.println("6");
            }
            else if(n == 1) {
                System.out.println("8");
            }
            else if (n == 2) {
                System.out.println("4");
            }
            else
                System.out.println("2");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
