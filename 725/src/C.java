import java.io.*;
import java.util.*;
import java.math.*;

public class C {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            String inp = in.readLine();
            int count[] = new int[26];
            int firstocc[] = new int[26];
            int first = -1,sec = -1;
            for (int i = 0; i < inp.length(); i++) {
                count[inp.charAt(i) - 'A']++;
                if (count[inp.charAt(i) - 'A'] == 2) {
                    first = firstocc[inp.charAt(i) - 'A'];
                    sec = i;
                    break;
                }
                else {
                    firstocc[inp.charAt(i)- 'A']=i;
                }
            }
            if (first + 1 == sec) {
                out.write("Impossible");
                out.close();
                return;
            }
            //removing duplicate i.e. second occurance
            String s = inp.substring(0, sec) + inp.substring(sec + 1);
            //finding mid
            int mid = (first + sec) / 2;
            String ns = s.substring(mid) + s.substring(0, mid);
            out.write(s.substring(0, 13));
            out.newLine();
            out.write(new StringBuilder(s.substring(13)).reverse().toString());
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
