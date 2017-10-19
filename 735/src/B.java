import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int n1 = in.readInt();
            int n2 = in.readInt();
            int min = Math.min(n1, n2);
            int max = Math.max(n1, n2);
            int car[] = new int[n];
            for (int i = 0; i < n; i++) {
                car[i] = in.readInt();
            }
            Arrays.sort(car);
            double first = 0d;
            double second = 0d;
            int j = n - 1;
            for (int i = 0; i < min; i++) {
                first += car[j--];
            }
            for (int i = 0; i < max; i++) {
                second += car[j--];
            }
            double mean = (first / min) + (second / max);
            System.out.println(mean);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
