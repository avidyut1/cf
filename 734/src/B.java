import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int k2 = in.readInt();
            int k3 = in.readInt();
            int k5 = in.readInt();
            int k6 = in.readInt();
            long ans = 0l;
            int numberof256 = Math.min(Math.min(k2, k5), k6);
            ans += (256l * (long)numberof256);
            k2 -= numberof256;
            int numberof32 = Math.min(k2, k3);
            ans += (32l * (long)numberof32);
            System.out.println(ans);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
