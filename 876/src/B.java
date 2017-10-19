import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            int k = in.readInt();
            int m = in.readInt();
            int ar[] = new int[n];
            Vector<Integer> nums[] = new Vector[m];
            for (int i = 0; i < m; i++) {
                nums[i] = new Vector<>();
            }
            for (int i = 0; i < n; i++) {
                ar[i] = in.readInt();
                nums[ar[i] % m].add(ar[i]);
            }
            boolean ans = false;
            for (int i = 0; i < m; i++) {
                if (nums[i].size() >= k) {
                    out.write("Yes");
                    out.newLine();
                    ans = true;
                    int count = 0;
                    for(int res: nums[i]) {
                        out.write(Integer.toString(res) +" ");
                        count++;
                        if (count == k) {
                            break;
                        }
                    }
                    break;
                }
            }
            if (!ans) {
                out.write("No");
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
