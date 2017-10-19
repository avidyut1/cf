import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int l[] = new int[n];
            int r[] = new int[n];
            int suml = 0;
            int sumr = 0;
            for (int i = 0; i < n; i++) {
                l[i] = in.readInt();
                r[i] = in.readInt();
                suml += l[i];
                sumr += r[i];
            }
            int originalBeauty = Math.abs(suml - sumr);
            int maxBeauty = originalBeauty;
            int ind = -1;
            for (int i = 0; i < n; i++) {
                int newsl = suml - l[i] + r[i];
                int newsr = sumr - r[i] + l[i];
                int beauty = Math.abs(newsl - newsr);
                if (maxBeauty < beauty) {
                    ind = i + 1;
                    maxBeauty = beauty;
                }
            }
            if (maxBeauty == originalBeauty) {
                System.out.println(0);
            }
            else {
                System.out.println(ind);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
