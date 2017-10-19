import java.io.*;
import java.util.*;
import java.math.*;

public class C {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            if (n == 1) {
                System.out.println(-1);
                return;
            }
            System.out.println(n+" "+(n + 1)+" "+(n * (n + 1)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
