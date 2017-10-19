import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            String s[] = in.readLine().split(" ");
            int res = 0;
            for (int i = 0; i < s.length; i++) {
                if (s[i].equals("?")) {
                    s[i] = "1";
                    if (i - 1 >= 0) {
                        if (s[i - 1].equals("-")) {
                            res -= 1;
                        }
                        else {
                            res += 1;
                        }
                    }
                    else {
                        res = 1;
                    }
                }
            }
            res--;
            int n = Integer.parseInt(s[s.length - 1]);
            int remvalue = Integer.parseInt(s[s.length - 1]) - res ;
            if (remvalue >= 1 && remvalue <= n) {
                System.out.println("Possible");
                s[s.length - 3] = remvalue + "";
                for (int i = 0; i < s.length; i++) {
                    System.out.print(s[i]+" ");
                }
            }
            else if (remvalue > n){
                s[s.length - 3] = "" + n;
                int remainder = remvalue - n;
                s[0] = remainder + Integer.parseInt(s[0]) + "";
                boolean ans = true;
                for (int i = 0; i < s.length; i++) {
                    if (s[i].equals("=") || s[i].equals("+") || s[i].equals("-")) {
                        continue;
                    }
                    if (Integer.parseInt(s[i]) > n || Integer.parseInt(s[i]) < 1) {
                        ans = false;
                        break;
                    }
                }
                if (ans) {
                    System.out.println("Possible");
                    for (int i = 0; i < s.length; i++) {
                        System.out.print(s[i] + " ");
                    }
                }
                else {
                    System.out.println("Impossible");
                }
            }
            else {
                System.out.println("Impossible");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
