import java.io.*;
import java.util.*;
import java.math.*;

public class C {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            int k = in.readInt();
            int ar[][] = new int[n][k];
            ProblemCount[] pc = new ProblemCount[n];
            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int j = 0; j < k; j++) {
                    ar[i][j] = in.readInt();
                    count += ar[i][j];
                }
                pc[i] = new ProblemCount(i, count);
            }
            Arrays.sort(pc);
            boolean yes = false;
            int countknown[] = new int[k];
            for (int i = 0; i < n; i++) {
                int index = pc[i].problemIndex;
                for (int j = 0; j < k; j++) {
                    countknown[j] += ar[index][j];
                }
                int half = (i + 1) / 2;
                boolean flag = true;
                for (int j = 0; j < k; j++) {
                    if (countknown[j] > half) {
                        flag = false;
                    }
                }
                if (flag) {
                    yes = true;
                }
            }
            if (yes) {
                out.write("YES");
            }
            else {
                out.write("NO");
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class ProblemCount implements Comparable<ProblemCount> {

    public int problemIndex;
    public int count;

    public ProblemCount(int problemIndex, int count) {
        this.problemIndex = problemIndex;
        this.count = count;
    }

    public int compareTo(ProblemCount that) {
        return Integer.compare(this.count, that.count);
    }
}
