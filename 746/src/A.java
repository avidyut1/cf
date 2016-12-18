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
            int quantity = c / 4;
            quantity = Math.min(quantity, b / 2);
            quantity = Math.min(quantity, a);
            System.out.println(quantity* 4 + quantity * 2 + quantity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
