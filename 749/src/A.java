import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            int count2 = 0;
            int count3 = 0;
            while(true) {
                n -= 2;
                count2++;
                if (n == 1) {
                    count2--;
                    count3++;
                    break;
                }
                else if (n == 0) {
                    break;
                }
            }
            out.write(Integer.toString(count2 + count3));
            out.newLine();
            for (int i = 0; i < count2; i++) {
                out.write(Integer.toString(2)+" ");
            }
            for (int i = 0; i < count3; i++) {
                out.write(Integer.toString(3)+" ");
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
