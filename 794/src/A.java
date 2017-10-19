import java.io.*;
import java.util.*;
import java.math.*;

/**
 * created by asheshvidyut on 13/05/17
 **/
public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int a = in.readInt();
            int b = in.readInt();
            int c = in.readInt();
            int n = in.readInt();
            int ans = 0;
            for (int i = 0; i < n; i++) {
                int xi = in.readInt();
                if (xi > b && xi < c){
                    ans++;
                }
            }
            out.write(Integer.toString(ans));
            out.newLine();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
