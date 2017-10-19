import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            String inp[] = (in.readLine()).split(" ");
            String s1 = inp[0];
            String s2 = inp[1];
            BigInteger b1 = new BigInteger(s1);
            BigInteger b2 = new BigInteger(s2);
            if (b1.equals(b2)) {
                System.out.println(b1);
            }
            else{
                System.out.println(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
