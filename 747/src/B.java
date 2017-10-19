import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            char c[] = in.readLine().toCharArray();
            if (n % 4 != 0) {
                out.write("===");
                out.close();
                return;
            }
            int each = c.length / 4;
            int counta = 0, countg = 0, countc = 0, countt = 0;
            for (int i = 0; i < n; i++) {
                if (c[i] == 'A') {
                    counta++;
                }
                else if(c[i] == 'G') {
                    countg++;
                }
                else if(c[i] == 'C') {
                    countc++;
                }
                else if(c[i] == 'T'){
                    countt++;
                }
            }
            if (counta > each || countc > each || countg > each || countt > each) {
                out.write("===");
                out.close();
                return;
            }
            int rema = each - counta;
            int remg = each - countg;
            int remc = each - countc;
            int remt = each - countt;
            for (int i = 0; i < n; i++) {
                if (c[i] == '?') {
                    if (rema > 0) {
                        c[i] = 'A';
                        rema--;
                        continue;
                    }
                    if(remg > 0) {
                        c[i] = 'G';
                        remg--;
                        continue;
                    }
                    if (remc > 0) {
                        c[i] = 'C';
                        remc--;
                        continue;
                    }
                    if (remt > 0) {
                        c[i] = 'T';
                        remt--;
                    }
                }
            }
            if (!(rema ==0 && remg == 0&& remc ==0 && remt == 0)) {
                out.write("===");
                out.close();
                return;
            }
            for (int i = 0; i < n; i++) {
                out.write(c[i]);
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
