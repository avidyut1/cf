import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            char inp[] = in.readLine().toCharArray();
            String pattern = "Bulbasr";
            int freq[] = new int[pattern.length()];
            for (int i = 0; i < inp.length; i++) {
                for (int j = 0; j < pattern.length(); j++) {
                    if (pattern.charAt(j) == inp[i]) {
                        freq[j]++;
                    }
                }
            }
            freq[1] /= 2;
            freq[4] /= 2;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < freq.length; i++) {
                min = Math.min(min, freq[i]);
            }
            out.write(Integer.toString(min));
            out.newLine();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
