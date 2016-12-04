import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            String inp = (in.readLine());
            Double d = Double.parseDouble(inp);
            String res = d.toString();
            int indd = res.indexOf('.');
            boolean ans = true;
            for (int i = indd + 1; i < res.length(); i++) {
                if(res.charAt(i) != '0') {
                    ans = false;
                    break;
                }
            }
            if(ans) {
                System.out.println(res.substring(0, indd));
            }
            else
            System.out.printf("%.3f", d);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
