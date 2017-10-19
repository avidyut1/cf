import java.io.*;
import java.util.*;
import java.math.*;

/**
 * created by asheshvidyut on 18/03/17
 **/
public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int a = in.readInt();
            int b = in.readInt();
            int year = 0;
            while(true) {
                if (a > b) {
                    break;
                }
                a = 3 * a;
                b = 2 * b;
                year++;
            }
            out.write(Integer.toString(year));
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
