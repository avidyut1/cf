import java.io.*;
import java.util.*;
import java.math.*;

public class C {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int m = in.readInt();
            Set<Integer> hs = new HashSet<Integer>();
            for (int i = 0; i < n; i++) {
                hs.add(in.readInt());
            }
            int i = 1;
            Vector<Integer> res = new Vector<Integer>();
            while(m > 0) {
                while (hs.contains(i)) {
                    i++;
                }
                if(m - i >= 0) {
                    m -= i;
                    res.add(i);
                    hs.add(i);
                }
                else {
                    break;
                }
            }
            System.out.println(res.size());
            for(int ii: res) {
                System.out.print(ii+" ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
