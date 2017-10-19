import java.io.*;
import java.util.*;
import java.math.*;

/**
 * created by asheshvidyut on 13/05/17
 **/
public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int base = 1;
            int n = in.readInt();
            int height = in.readInt();
            double area = ((double) base * height) / 2;
            double equal = area / n;
            double h1 = Math.sqrt(2 * height * equal);
            double hprev = h1;
            double a = (equal * 2) / hprev;
            System.out.printf("%.9f ", h1);
            for (int i = 0; i < n - 2; i++) {
                double hsummation = Math.sqrt((hprev * (i + 2) * equal * 2) / a);
                System.out.printf("%.9f ", hsummation);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
