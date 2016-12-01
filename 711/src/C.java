import java.io.*;
import java.util.*;
import java.math.*;

public class C {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int m = in.readInt();
            int k = in.readInt();
            int car[] = new int[n];
            for (int i = 0; i < n; i++) {
                car[i] = in.readInt();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
