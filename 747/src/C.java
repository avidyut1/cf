import java.io.*;
import java.util.*;
import java.math.*;

public class C {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            int server[] = new int[n];
            Arrays.fill(server, -7);
            int q = in.readInt();
            for (int i = 0; i < q; i++) {
                int t = in.readInt();
                int k = in.readInt();
                int d = in.readInt();
                Vector<Integer> selected = new Vector<Integer>();
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (server[j] < t) {
                        selected.add(j + 1);
                        count++;
                        if (count == k) {
                            break;
                        }
                    }
                }
                if(count != k) {
                    out.write("-1");
                    out.newLine();
                    continue;
                }
                int result = 0;
                for(int sel: selected) {
                    result+=sel;
                    server[sel - 1] = t + d - 1;
                }
                out.write(Integer.toString(result));
                out.newLine();
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
