import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int countf = 0, counts = 0;
            for (int i = 0; i < n; i++) {
                int f = in.readInt();
                int s = in.readInt();
                if (f > s) {
                    countf++;
                }
                else if(s > f) {
                    counts++;
                }
            }
            if (countf > counts) {
                System.out.println("Mishka");
            }
            else if (counts > countf) {
                System.out.println("Chris");
            }
            else {
                System.out.println("Friendship is magic!^^");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
