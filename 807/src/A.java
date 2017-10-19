import java.io.*;
import java.util.*;
import java.math.*;

/**
 * created by asheshvidyut on 07/05/17
 **/
public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            int before[] = new int[n];
            int after[] = new int[n];
            boolean rated = false;
            for (int i = 0; i < n; i++) {
                before[i] = in.readInt();
                after[i] = in.readInt();
                if (before[i] != after[i]) {
                    rated = true;
                }
            }
            if (!rated) {
                boolean unrated = false;
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (before[i] < before[j]) {
                            unrated = true;
                            break;
                        }
                    }
                }
                if (unrated) {
                    out.write("unrated");
                }
                else {
                    out.write("maybe");
                }
            }
            else {
                out.write("rated");
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
