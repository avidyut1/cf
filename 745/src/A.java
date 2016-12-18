import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            String s = in.readLine();
            String ss = s + s;
            Set<String> hs = new HashSet<String>();
            for (int i = 0; i < ss.length(); i++) {
                int j = i + s.length();
                if (j < ss.length()) {
                    String sub = ss.substring(i, j);
                    hs.add(sub);
                }
            }
            System.out.println(hs.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
