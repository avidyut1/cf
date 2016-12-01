import java.io.*;
import java.util.*;
import java.math.*;
public class A {
    public static void main(String[] args) {
        try{
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            String s = in.readLine();
            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '<') {
                    ans++;
                }
                else break;
            }
            for (int i = n - 1; i >= 0; i--) {
                if (s.charAt(i) == '>') {
                    ans++;
                }
                else break;
            }
            out.write(Integer.toString(ans));
            out.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
