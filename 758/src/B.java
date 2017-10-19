import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int r = 0, b = 0, y = 0, g = 0;
            char s[] = in.readLine().toCharArray();
            boolean v[] = new boolean[s.length];
            for (int i = 0; i < s.length; i++) {
                if (s[i] == '!') {
                    continue;
                }
                for (int j = i; j < s.length; j+=4) {
                    if (v[j])
                        continue;
                    if (s[i] == 'R' && s[j] == '!') {
                        v[j] = true;
                        r++;
                    }
                    if (s[i] == 'B' && s[j] == '!') {
                        v[j] = true;
                        b++;
                    }
                    if (s[i] == 'G' && s[j] == '!') {
                        g++;
                        v[j] = true;
                    }
                    if (s[i] == 'Y' && s[j] == '!') {
                        y++;
                        v[j] = true;
                    }
                }
                for (int j = i; j >= 0; j-=4) {
                    if (v[j])
                        continue;
                    if (s[i] == 'R' && s[j] == '!') {
                        r++;
                        v[j] = true;
                    }
                    if (s[i] == 'B' && s[j] == '!') {
                        b++;
                        v[j] = true;
                    }
                    if (s[i] == 'G' && s[j] == '!') {
                        g++;
                        v[j] = true;
                    }
                    if (s[i] == 'Y' && s[j] == '!') {
                        y++;
                        v[j] = true;
                    }
                }
            }
            out.write(Integer.toString(r)+ " ");
            out.write(Integer.toString(b) + " ");
            out.write(Integer.toString(y) + " ");
            out.write(Integer.toString(g));
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
