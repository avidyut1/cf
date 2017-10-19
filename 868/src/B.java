import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int h = in.readInt();
            int m = in.readInt();
            int s = in.readInt();
            int t1 = in.readInt();
            int t2 = in.readInt();
            boolean canReach = false;
            if (canReach)
                out.write("YES");
            else
                out.write("NO");
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
