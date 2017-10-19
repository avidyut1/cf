import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int ar[] = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = in.readInt();
            }
            if (n == 1) {
                if (ar[0] == 15)
                    System.out.println("DOWN");
                else if(ar[0] == 0)
                    System.out.println("UP");
                else
                    System.out.println("-1");
            }
            else{
                if (ar[n - 1] > ar[n - 2]) {
                    if (ar[n - 1] == 15) {
                        System.out.println("DOWN");
                    }
                    else
                        System.out.println("UP");
                }
                else {
                    if (ar[n - 1] == 0) {
                        System.out.println("UP");
                    }
                    else
                        System.out.println("DOWN");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
