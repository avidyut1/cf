import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            long x = in.readLong();
            int distress = 0;
            for (int i = 0; i < n; i++) {
                char c = in.readCharacter();
                if (c == '+') {
                    x += in.readInt();
                }
                else{
                    long req = in.readLong();
                    if (req > x) {
                        distress++;
                    }
                    else
                        x -= req;
                }
            }
            System.out.println(x+" "+distress);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
