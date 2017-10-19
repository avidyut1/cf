import java.io.*;
import java.util.*;
import java.math.*;

public class D {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            BigInteger big = new BigInteger(""+n);
            if (big.isProbablePrime(229)) {
                System.out.println(1);
            }
            else{
                if (n % 2 == 0){
                    System.out.println(2);
                }
                else {
                    BigInteger one = BigInteger.ONE;
                    BigInteger two = one.add(one);
                    BigInteger nm2 = big.subtract(two);
                    if (nm2.isProbablePrime(220)) {
                        System.out.println(2);
                    }
                    else
                        System.out.println(3);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
