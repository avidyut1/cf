import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int m = in.readInt();
            String s[] = new String[n];
            for (int i = 0; i < n; i++) {
                s[i] = in.readLine();
            }
            Vector<Integer> countrx = new Vector<Integer>();
            Vector<Integer> countcx = new Vector<Integer>();
            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int j = 0; j < s[i].length(); j++) {
                    if (s[i].charAt(j) == 'X') {
                        count++;
                    }
                }
                if (count > 0) {
                    countrx.add(count);
                }
            }
            for (int i = 0; i < m; i++) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (s[j].charAt(i) == 'X') {
                        count++;
                    }
                }
                if (count > 0) {
                    countcx.add(count);
                }
            }
            Collections.sort(countrx);
            Collections.sort(countcx);
            if (countcx.size() > 0 && countrx.size() > 0 && countcx.get(0) == countcx.get(countcx.size() - 1) && countrx.get(0) == countrx.get(countrx.size() - 1)) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
