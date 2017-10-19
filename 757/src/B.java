import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            final int MAX = (int)1e5 + 1;
            int freq[] = new int[MAX];
            for (int i = 0; i < n; i++) {
                freq[in.readInt()]++;
            }
            int max = 1;
            for (int i = 2; i < MAX; i++) {
                int count = 0;
                for (int j = i; j < MAX; j+=i) {
                    count += freq[j];
                }
                max = Math.max(count, max);
            }
            out.write(Integer.toString(max));
            out.newLine();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
