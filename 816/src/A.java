import java.io.*;
import java.util.*;
import java.math.*;

/**
 * created by asheshvidyut on 17/06/17
 **/
public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            String time[] = in.readLine().split(":");
            String hh = time[0];
            String mm = time[1];
            int ans = 0;
            while(!isPalin(hh, mm)) {
                ans++;
                int minutes = Integer.parseInt(mm) + 1;
                if (minutes == 60) {
                    int hours = Integer.parseInt(hh) + 1;
                    if (hours == 24) {
                        hours = 0;
                    }
                    minutes = 0;
                    hh = ""+hours;
                    if (hh.length() == 1) {
                        hh = "0" + hh;
                    }
                }
                mm = "" + minutes;
                if (mm.length() == 1) {
                    mm = "0" + mm;
                }
            }
            out.write(Integer.toString(ans));
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static boolean isPalin(String hh, String mm) {
        StringBuffer sb = new StringBuffer(hh).reverse();
        if (sb.toString().equals(mm)) {
            return true;
        }
        return false;
    }
}
