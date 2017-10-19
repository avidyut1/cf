import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            Set<Integer> hs = new HashSet<Integer>();
            int max = 0;
            for (int i = 0; i < 2 * n; i++) {
                int sockid = in.readInt();
                if (hs.contains(sockid)) {
                    hs.remove(sockid);
                }
                else{
                    hs.add(sockid);
                }
                max = Math.max(max, hs.size());
            }
            out.write(Integer.toString(max));
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
