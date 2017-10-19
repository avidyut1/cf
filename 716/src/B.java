import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            String inp = (in.readLine());
            String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            boolean can = false; String res = "";
            for (int i = 0; i < inp.length(); i++) {
                if (i + 25 < inp.length()){
                    char str[] = new char[26];
                    for (int j = 0; j < 26; j++) {
                        str[j] = inp.charAt(i + j);
                    }
                    int found[] = new int[26];
                    Vector<Integer> indq = new Vector<Integer>();
                    for (int j = 0; j < 26; j++) {
                        if (str[j] == '?') {
                            indq.add(j);
                            continue;
                        }
                        int ind = alpha.indexOf(str[j]);
                        found[ind]++;
                    }
                    boolean canfill = true;
                    Vector<Character> nf = new Vector<Character>();
                    for (int j = 0; j < 26; j++) {
                        if (found[j] == 1) {
                            continue;
                        }
                        if (found[j] == 0) {
                            nf.add(alpha.charAt(j));
                            continue;
                        }
                        else {
                            canfill = false;
                        }
                    }
                    if (canfill) {
                        if (nf.size() == indq.size()) {
                            int vi = 0;
                            for (int ind: indq) {
                                str[ind] = nf.get(vi++);
                            }
                        }
                        else {
                            canfill = false;
                        }
                    }
                    if (canfill)  {
                        can = true;
                        res = inp.substring(0, i) + new String(str) + inp.substring(i + 26);
                        break;
                    }
                }
            }
            if (can) {
                char resar[] = res.toCharArray();
                for (int i = 0; i < resar.length; i++) {
                    if(resar[i] == '?') {
                        resar[i] = 'A';
                    }
                }
                System.out.println(new String(resar));
            }
            else {
                System.out.println("-1");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
