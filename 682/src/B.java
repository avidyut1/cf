import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            Queue<Integer> pq = new PriorityQueue<Integer>();
            for (int i = 0; i < n; i++) {
                pq.add(in.readInt());
            }
            int mex = 1;
            while(!pq.isEmpty()) {
                int val = pq.poll();
                if (val == mex) {
                    mex++;
                }
                else if (val > mex) {
                    mex++;
                }
            }
            System.out.println(mex);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
