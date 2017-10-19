import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int totalMinutes = 4 * 60;
            int n = in.readInt();
            int minjourney = in.readInt();
            int minrem = totalMinutes - minjourney;
            int min = 0;
            int ans = 0;
            for (int i = 1; i <= n; i++) {
                min = min + 5 * i;
                if (min <= minrem) {
                    ans = i;
                }
                else{
                    break;
                }
            }
            out.write(Integer.toString(ans));
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
