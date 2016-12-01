import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            String s = "ogo";
            Vector<String> filter = new Vector<String>();
            filter.add(s);
            for (int i = 0; i < 2000; i++) {
                s = s + "go";
                filter.add(s);
            }
            int n = in.readInt();
            String inp = in.readLine();
            for (int i = filter.size() - 1; i >= 0; i--) {
                while(inp.indexOf(filter.get(i)) >= 0) {
                    inp = inp.replace(filter.get(i), "***");
                }
            }
            System.out.println(inp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
