import java.io.*;
import java.util.*;
import java.math.*;

/**
 * created by asheshvidyut on 21/04/17
 **/
public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            String ar[] = new String[n];
            for (int i = 0; i < n; i++) {
                ar[i] = in.readLine();
            }
            int len = ar[0].length();
            String repAr[] = new String[n];
            for (int i = 0; i < n; i++) {
                repAr[i] = ar[i] + ar[i];
            }
            List<String> subs = new ArrayList<String>();
            boolean foundInAll = false;
            for (int i = 0; i < repAr[0].length(); i++) {
                if (i + len >= repAr[0].length()) {
                    break;
                }
                String check = repAr[0].substring(i, i + len);
                boolean all = true;
                for (int j = 0; j < n; j++) {
                    if (!repAr[j].contains(check)) {
                        all = false;
                        break;
                    }
                }
                if (all) {
                    foundInAll = true;
                    subs.add(check);
                }
            }
            if (foundInAll) {
                int minAnser = Integer.MAX_VALUE;
                for (String subst: subs) {
                    int ans = 0;
                    for (int i = 0; i < n; i++) {
                        ans += repAr[i].indexOf(subst);
                    }
                    minAnser = Math.min(minAnser, ans);
                }
                out.write(Integer.toString(minAnser));
            }
            else {
                out.write(Integer.toString(-1));
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
