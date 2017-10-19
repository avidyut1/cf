import java.io.*;
import java.util.*;
import java.math.*;

/**
 * created by asheshvidyut on 04/05/17
 **/
public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            Vector<Integer> primes = new Vector<Integer>();
            for (int i = 2; i < 100; i++) {
                if (isPrime(i)) {
                    primes.add(i);
                }
            }
            int l = in.readInt();
            int r = in.readInt();
            int ans = Integer.MIN_VALUE;
            int maxCount = Integer.MIN_VALUE;
            for(int prime: primes) {
                int count = r / prime - ((l - 1) / prime);
                if (count > maxCount) {
                    maxCount = count;
                    ans = prime;
                }
            }
            out.write(Integer.toString(ans));
            out.newLine();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static boolean isPrime(int i) {
        for (int j = 2; j < Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
