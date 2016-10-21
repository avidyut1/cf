import java.io.*;
import java.util.*;
import java.math.*;
public class B{
    public static void main(String[] args) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            int k = in.readInt();
            int ar[] = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = in.readInt();
            }
            int min = 0;
            int b[] = new int[n];
            b[0] = ar[0];
            for (int i = 1; i < n; i++) {
                int req = k - b[i - 1];
                if (ar[i] < req) {
                    min += (req - ar[i]);
                    b[i] = req;
                }
                else {
                    b[i] = ar[i];
                }
            }
            out.write(Integer.toString(min));
            out.newLine();
            for (int i = 0; i < n; i++) {
                out.write(Integer.toString(b[i])+ " ");
            }
            out.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}



