import java.io.*;
import java.util.*;
import java.math.*;

public class D {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            int ar[] = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = in.readInt() - 1;
            }
            int freq[] = new int[n];
            for (int i = 0; i < n; i++) {
                freq[ar[i]]++;
            }
            Queue<Integer> q = new PriorityQueue<>();
            for (int i = 0; i < n; i++) {
                if (freq[i] == 0) {
                    q.add(i);
                }
            }
            int count = 0;
            boolean vis[] = new boolean[n];
            for (int i = 0; i < n; i++) {
                if (freq[ar[i]] == 1)
                    continue;
                if ((q.size() > 0 && ar[i] > q.peek()) || vis[ar[i]]) {
                    freq[ar[i]]--;
                    count++;
                    ar[i] = q.poll();
                }
                vis[ar[i]] = true;
            }
            out.write(Integer.toString(count));
            out.newLine();
            for (int i = 0; i < n; i++) {
                out.write(Integer.toString(ar[i] + 1)+ " ");
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
