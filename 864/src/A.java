import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            Set<Integer> hs = new HashSet<>();
            int freq[] = new int[1000];
            for (int i = 0; i < n; i++) {
                int val = in.readInt();
                hs.add(val);
                freq[val]++;
            }
            if (hs.size() == 2) {
                Vector<Integer> nums = new Vector<>();
                for(int num: hs) {
                    nums.add(num);
                }
                int v1 = nums.get(0);
                int v2 = nums.get(1);
                if (freq[v1] == freq[v2]) {
                    out.write("YES");
                    out.newLine();
                    out.write(Integer.toString(v1)+ " "+Integer.toString(v2));
                    out.newLine();
                }
                else {
                    out.write("NO");
                }
            }
            else {
                out.write("NO");
            }
            out.newLine();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
