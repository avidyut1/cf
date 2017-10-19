import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            int m = in.readInt();
            int ar1[] = new int[n];
            int ar2[] = new int[m];
            for (int i = 0; i < n; i++) {
                ar1[i] = in.readInt();
            }
            for (int i = 0; i < m; i++) {
                ar2[i] = in.readInt();
            }
            Arrays.sort(ar1);
            Arrays.sort(ar2);
            for (int i = 0; i < 100; i++) {
                int fd = Integer.parseInt(Character.toString(Integer.toString(i).charAt(0)));
                int sd = i % 10;
                if (Arrays.binarySearch(ar1, fd) >= 0 && Arrays.binarySearch(ar2, sd) >= 0) {
                    out.write(Integer.toString(i));
                    break;
                }
                if (Arrays.binarySearch(ar1, sd) >= 0 && Arrays.binarySearch(ar2, fd) >= 0) {
                    out.write(Integer.toString(i));;
                    break;
                }
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
