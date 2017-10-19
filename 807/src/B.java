import java.io.*;
import java.util.*;
import java.math.*;

/**
 * created by asheshvidyut on 07/05/17
 **/
public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int p = in.readInt();
            int x = in.readInt();
            int y = in.readInt();
            int min = Integer.MAX_VALUE;
            int s = y;
            while(true){
                Set<Integer> hs = new HashSet<Integer>();
                int sh = 0;
                int unsh = 0;
                int i = (s / 50)  % 475;
                for (int j = 0; j < 25; j++) {
                    i = ((i * 96) + 42) % 475;
                    hs.add(26 + i);
                }
                if (hs.contains(p)) {
                    if (s >= x) {
                        int tempx = x;
                        while(s > tempx) {
                            sh += 1;
                            tempx += 100;
                        }
                        while(tempx > s) {
                            unsh += 1;
                            tempx -= 50;
                        }
                        if (tempx == s) {
                            min = Math.min(min, sh);
                            break;
                        }
                    }
                    else {
                        int tempx = x;
                        while(tempx > s) {
                            tempx -= 50;
                            unsh++;
                        }
                        while(tempx < s) {
                            tempx += 100;
                            sh++;
                        }
                        if (tempx == s) {
                            min = Math.min(min, sh);
                        }
                    }
                }
                s++;
            }
            out.write(Integer.toString(min));
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
