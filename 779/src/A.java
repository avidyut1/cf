import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            int groupA[] = new int[6];
            int groupB[] = new int[6];
            for (int i = 0; i < n; i++) {
                groupA[in.readInt()]++;
            }
            for (int i = 0; i < n; i++) {
                groupB[in.readInt()]++;
            }
            boolean ans = true;
            int sendA = 0, sendB = 0;
            for (int i = 1; i < 6; i++) {
                if (groupA[i] == groupB[i]) {
                    continue;
                }
                int diff = Math.abs(groupA[i] - groupB[i]);
                if (groupA[i] > groupB[i]) {
                    if (diff % 2 == 0) {
                        sendA += diff / 2;
                    }
                    else {
                        ans = false;
                    }
                }
                else {
                    if (diff % 2 == 0) {
                        sendB += diff / 2;
                    }
                    else {
                        ans = false;
                    }
                }
            }
            if (ans && sendA == sendB) {
                out.write(Integer.toString(sendA));
            }
            else
                out.write(Integer.toString(-1));
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
