import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int t = in.readInt();
            int s = in.readInt();
            int x = in.readInt();
            int val = x - t;
            int val2 = x - t - 1;
            if(val >= 0 || val2 >= 0) {
                if (val % s == 0){
                    System.out.println("YES");
                }
                else if(val2 % s == 0) {
                    int d = val2 / s;
                    if (d != 0) {
                        System.out.println("YES");
                    }
                    else
                        System.out.println("NO");
                }
                else
                    System.out.println("NO");
            }
            else
                System.out.println("NO");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
