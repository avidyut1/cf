import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int a = in.readInt() - 1;
            int b = in.readInt() - 1;
            char s[] = in.readLine().toCharArray();
            if (s[a] == s[b]) {
                System.out.println(0);
            }
            else{
                System.out.println(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
