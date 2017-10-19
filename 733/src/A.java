import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            String s = "A" + in.readLine() + "A";
            int prev = 0;
            int min = 0;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U' || s.charAt(i) == 'Y'){
                    int d = i - prev;
                    min = Math.max(min, d);
                    prev = i;
                }
            }
            min = Math.max(min, s.length() - prev);
            System.out.println(min);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
