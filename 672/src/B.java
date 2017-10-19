import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            String s = in.readLine();
            int freq[] = new int[26];
            for (int i = 0; i < s.length(); i++) {
                freq[s.charAt(i) - 'a']++;
            }
            int free = 0;
            for (int i = 0; i < 26; i++) {
                if (freq[i] == 0){
                    free++;
                }
            }
            int ans = 0;
            for (int i = 0; i < 26; i++) {
                if (freq[i] > 1) {
                    int change = freq[i] - 1;
                    if (change > free) {
                        System.out.println(-1);
                        return;
                    }
                    else{
                        free -= change;
                        ans += change;
                    }
                }
            }
            System.out.println(ans);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
