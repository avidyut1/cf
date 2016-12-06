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
            if(a == b) {
                System.out.println("YES");
                return;
            }
            if (c != 0) {
                if ((b - a) % c == 0) {
                    if ((b - a) / c > 0)
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                }
                else
                    System.out.println("NO");
            }
            else {
                if (a == b) {
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
