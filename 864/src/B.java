import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            String s = in.readLine();
            StringBuffer sb = new StringBuffer(s);
            for (int i = 0; i < s.length(); i++) {
                if (Character.toUpperCase(s.charAt(i)) == s.charAt(i)) {
                    sb.setCharAt(i, '#');
                }
            }
            String test = new String(sb);
            String res[] = test.split("#");
            int max = 0;
            for (String sres: res) {
                Set<Character> chars = new HashSet<>();
                for (int i = 0; i < sres.length(); i++) {
                    chars.add(sres.charAt(i));
                }
                max = Math.max(max, chars.size());
            }
            out.write(Integer.toString(max));
            out.newLine();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
