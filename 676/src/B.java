import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    static Map<Integer, Integer> level = new HashMap<Integer, Integer>();
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int t = in.readInt();
            int levelc = 1;
            double ar[] = new double[(n * (n + 1)) / 2];
            for (int i = 0; i < ar.length; i++) {
                int j = i;
                for (; j < levelc + i; j++) {
                    level.put(j, levelc);
                }
                i = j - 1;
                levelc++;
            }
            ar[0] = (double)t;
            for (int i = 0; i < ar.length; i++) {
                if (ar[i] > 1.0d) {
                    double overflow = ar[i] - 1.0d;
                    ar[i] = 1.0d;
                    if (i + level.get(i) < ar.length)
                    ar[i + level.get(i)] += overflow / 2.0d;
                    if (i + level.get(i) + 1 < ar.length)
                    ar[i + level.get(i) + 1] += overflow / 2.0d;
                }
            }
            int ans = 0;
            for (int i = 0; i < ar.length; i++) {
                if (ar[i] == 1.0d) {
                    ans++;
                }
            }
            System.out.println(ans);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
