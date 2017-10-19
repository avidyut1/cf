import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            int a = in.readInt();
            int b = in.readInt();
            int c = in.readInt();
            int ar[] = new int[]{a, b, c};
            int ans = 0;
            int current = 0;
            n--;
            while(n != 0) {
                if (current == 0) {
                    if (ar[0] < ar[1]) {
                        current = 1;
                        ans += ar[0];
                        n--;
                    }
                    else {
                        current = 2;
                        ans += ar[1];
                        n--;
                    }
                }
                else if (current == 1) {
                    if (ar[0] < ar[2]) {
                        current = 0;
                        ans += ar[0];
                        n--;
                    }
                    else {
                        current = 1;
                        ans += ar[2];
                        n--;
                    }
                }
                else {
                    if (ar[1] < ar[2]) {
                        current = 0;
                        ans += ar[1];
                        n--;
                    }
                    else {
                        current = 1;
                        ans += ar[2];
                        n--;
                    }
                }
            }
            out.write(Integer.toString(ans));
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
