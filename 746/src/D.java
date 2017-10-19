import java.io.*;
import java.util.*;
import java.math.*;

public class D {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            Vector<Character> res = new Vector<Character>();
            int n = in.readInt();
            int k = in.readInt();
            int a = in.readInt();
            int b = in.readInt();
            boolean ans = true;
            if (a >= b) {
                Vector<Integer> indexb = new Vector<Integer>();
                int ki = 0;
                while(a != 0) {
                    res.add('G'); a--;
                    ki++;
                    if (ki == k && a > 0) {
                        ki = 0;
                        if (b > 0) {
                            res.add('B');
                            indexb.add(res.size() - 1);
                            b--;
                        }
                        else{
                            ans = false;
                        }
                    }
                }
                if(b != 0) {
                    for (int i = 0; i < indexb.size(); i++) {
                        int ib = indexb.get(i);
                        for (int j = 0; j < Math.min(b, k - 1); j++) {
                            res.add(ib, 'B');
                        }
                        b -= Math.min(b, k - 1);
                        if (b == 0) {
                            break;
                        }
                    }
                    if (b != 0) {
                        for (int i = 0; i < k; i++) {
                            res.add(0, 'B');
                            b--;
                            if (b == 0) {
                                break;
                            }
                        }
                        if (res.size() - 1 == 'G') {
                            for (int i = 0; i < k; i++) {
                                res.add(res.size() - 1, 'B');
                                b--;
                                if (b == 0) {
                                    break;
                                }
                            }
                        }
                        if (b != 0) {
                            ans = false;
                        }
                    }
                }
            }
            else {
                int ki = 0;
                Vector<Integer> indexg = new Vector<Integer>();
                while(b != 0) {
                    res.add('B'); b--;
                    ki++;
                    if (ki == k && b > 0) {
                        ki = 0;
                        if (a > 0) {
                            res.add('G');
                            indexg.add(res.size() - 1);
                            a--;
                        }
                        else{
                            ans = false;
                        }
                    }
                }
                if(a != 0) {
                    for (int i = 0; i < indexg.size(); i++) {
                        int ia = indexg.get(i);
                        for (int j = 0; j < Math.min(a, k - 1); j++) {
                            res.add(ia, 'G');
                        }
                        a -= Math.min(a, k - 1);
                        if (a == 0) {
                            break;
                        }
                    }
                    if (a != 0) {
                        for (int i = 0; i < k; i++) {
                            res.add(0, 'G');
                            a--;
                            if (a == 0) {
                                break;
                            }
                        }
                        if (res.size() - 1 == 'B') {
                            for (int i = 0; i < k; i++) {
                                res.add(res.size() - 1, 'G');
                                a--;
                                if (a == 0) {
                                    break;
                                }
                            }
                        }
                        if (a != 0) {
                            ans = false;
                        }
                    }
                }
            }
            if (ans) {
                for (int i = 0; i < res.size(); i++) {
                    out.write(res.get(i));
                }
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
