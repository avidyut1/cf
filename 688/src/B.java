import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            String n = in.readLine();
            String rev = new StringBuffer(n).reverse().toString();
            System.out.print(n);
            System.out.print(rev);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
