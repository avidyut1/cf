import java.io.*;
import java.util.*;
import java.math.*;

public class C {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            char s[] = in.readLine().toCharArray();
            Queue<Integer> rind = new LinkedList<Integer>();
            Queue<Integer> dind = new LinkedList<Integer>();
            for (int i = 0; i < n; i++) {
                if (s[i] == 'D') {
                    dind.add(i);
                }
                else{
                    rind.add(i);
                }
            }
            boolean el[] = new boolean[n];
            while(!(rind.size() == 0 || dind.size() == 0)) {
                for (int i = 0; i < n; i++) {
                    if (!el[i]) {
                        if (s[i] == 'D') {
                            if (rind.size() > 0)
                                el[rind.poll()] = true;
                        }
                        else{
                            if (dind.size() > 0)
                                el[dind.poll()] = true;
                        }
                    }
                }
            }
            if (rind.size() > 0) {
                out.write('R');
            }
            else{
                out.write('D');
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
