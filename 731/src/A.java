import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int pointer = 0;
            String inp = in.readLine();
            int ans = 0;
            for (int i = 0; i < inp.length(); i++) {
                char c = inp.charAt(i);
                int minans = Math.min(Math.abs(c - 'a' - pointer), 26 - Math.abs(c - 'a' - pointer));
                pointer = inp.charAt(i) - 'a';
                ans += minans;
            }
            System.out.println(ans);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
