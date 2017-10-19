import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            String pass = in.readLine();
            int n = in.readInt();
            String ar[] = new String[n];
            for (int i = 0; i < n; i++) {
                ar[i] = in.readLine();
                ar[i] = ar[i] + "" + ar[i];
            }
            boolean ans = false;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if ((ar[i] + "" + ar[j]).contains(pass)) {
                        ans = true;
                    }
                }
            }
            if(ans)
                out.write("YES");
            else
                out.write("NO");
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
