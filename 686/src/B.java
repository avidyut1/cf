import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int ar[] = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = in.readInt();
            }
            int sar[] = new int[n];
            System.arraycopy(ar, 0, sar, 0, n);
            Arrays.sort(sar);
            for (int i = 0; i < n; i++) {
                if (sar[i] == ar[i]) {
                    continue;
                }
                int j = i;
                for (; j < n; j++) {
                    if (ar[j] == sar[i]) {
                        break;
                    }
                }
                while(j != i) {
                    System.out.println(j+" "+(j + 1));
                    int temp = ar[j];
                    ar[j] = ar[j - 1];
                    ar[j - 1] = temp;
                    j--;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
