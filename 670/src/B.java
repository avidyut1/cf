import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int k = in.readInt();
            int ar[] = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = in.readInt();
            }
            int MAX = (int)1e6+1;
            long til[] = new long[MAX];
            for (int i = 0; i < MAX; i++) {
                til[i] = (long)(i + 1);
                til[i] += i - 1 >= 0? til[i - 1] : 0;
            }
            int ind = Arrays.binarySearch(til, k);
            if (ind < 0) {
                ind = -1 -ind;
            }
            if (ind - 1 >= 0)
                k -= til[ind - 1];
            if (k >= 0)
                System.out.println(ar[k - 1]);
            else
                System.out.println(ar[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
