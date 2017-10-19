import java.io.*;
import java.security.SecureRandom;
import java.util.*;
import java.math.*;

public class C {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int q = in.readInt();
            int MAX = (int)1e5 + 1;
            for (int i = 0; i < q; i++) {
                int n = in.readInt();
                int num = n;
                long ans = 0;
                if (n == 1) {
                    out.write(Integer.toString(-1));
                    out.newLine();
                    continue;
                }
                PollardRho.factors.clear();
                PollardRho.factor(new BigInteger("" + n));
                Vector<Integer> factors = new Vector<>();
                for (int fac: PollardRho.factors) {
                    factors.add(fac);
                }
                Collections.sort(factors);
                Vector<Integer> primePowers = new Vector<>();
                for (int factor: factors) {
                    int pow = 0;
                    while(n % factor == 0) {
                        n /= factor;
                        pow++;
                    }
                    primePowers.add(pow);
                }
                int selected = -1;
                for (int j = 0; j < primePowers.size(); j++) {
                    if (primePowers.get(j) >= 2) {
                        selected = j;
                        break;
                    }
                }
                long times = 1L;
                if (selected >= 0) {
                    for (int j = 0; j < primePowers.size(); j++) {
                        if (j == selected) {
                            int pow = primePowers.get(j) - 2;
                            if (pow > 0) {
                                times *= Math.pow(factors.get(j), pow);
                            }
                        }
                        else {
                            times *= Math.pow(factors.get(j), primePowers.get(j));
                        }
                    }
                    if (times > 0) {
                        ans = times;
                    }
                }
                if (primePowers.size() >= 2) {
                    long times2 = 1L;
                    for (int j = 0; j < primePowers.size(); j++) {
                        if (j < 2) {
                            times2 *= Math.pow(factors.get(j), primePowers.get(j) - 1);
                        }
                        else {
                            times2 *= Math.pow(factors.get(j), primePowers.get(j));
                        }
                        if (times2 > 0) {
                            ans = Math.max(ans, times2);
                        }
                    }
                }
                if (times == 1) {
                    if (!(new BigInteger(""+num).isProbablePrime(20))) {
                        ans = 1;
                    }
                    else {
                        ans = -1;
                    }
                }
                out.write(Long.toString(ans));
                out.newLine();
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

class PollardRho {
    private final static BigInteger ZERO = new BigInteger("0");
    private final static BigInteger ONE  = new BigInteger("1");
    private final static BigInteger TWO  = new BigInteger("2");
    private final static SecureRandom random = new SecureRandom();
    public static Set<Integer> factors = new HashSet<>();

    public static BigInteger rho(BigInteger N) {
        BigInteger divisor;
        BigInteger c  = new BigInteger(N.bitLength(), random);
        BigInteger x  = new BigInteger(N.bitLength(), random);
        BigInteger xx = x;

        // check divisibility by 2
        if (N.mod(TWO).compareTo(ZERO) == 0) return TWO;

        do {
            x  =  x.multiply(x).mod(N).add(c).mod(N);
            xx = xx.multiply(xx).mod(N).add(c).mod(N);
            xx = xx.multiply(xx).mod(N).add(c).mod(N);
            divisor = x.subtract(xx).gcd(N);
        } while((divisor.compareTo(ONE)) == 0);

        return divisor;
    }

    public static void factor(BigInteger N) {
        if (N.compareTo(ONE) == 0) return;
        if (N.isProbablePrime(20)) { factors.add(N.intValue()); return; }
        BigInteger divisor = rho(N);
        factor(divisor);
        factor(N.divide(divisor));
    }

}

