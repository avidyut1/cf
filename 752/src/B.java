import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            char fp[] = in.readLine().toCharArray();
            char wp[] = in.readLine().toCharArray();
            if (Arrays.equals(fp, wp)) {
                out.write(Integer.toString(0));
                out.close();
                return;
            }
            Map<Character, Character> hm = new HashMap<Character, Character>();
            Map<Character, Character> revhm = new HashMap<Character, Character>();
            boolean ans = true;
            for (int i = 0; i < fp.length; i++) {
                if (fp[i] == wp[i]) {
                    continue;
                }
                if (hm.containsKey(fp[i])){
                    if (hm.get(fp[i]) != wp[i]) {
                        ans = false;
                        break;
                    }
                }
                if (revhm.containsKey(fp[i])) {
                    if (revhm.get(fp[i]) != wp[i]) {
                        ans = false;
                        break;
                    }
                }
                else {
                    hm.put(fp[i], wp[i]);
                    revhm.put(wp[i], fp[i]);
                }
            }
            if (ans) {
                Set<Character> hs = hm.keySet();
                out.write(Integer.toString(hs.size()));
                out.newLine();
                for(char key: hs) {
                    out.write(Character.toString(key));
                    out.write(" ");
                    out.write(Character.toString(hm.get(key)));
                    out.newLine();
                }
            }
            else{
                out.write(Integer.toString(-1));
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
