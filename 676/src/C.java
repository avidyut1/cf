import java.io.*;
import java.util.*;
import java.math.*;

public class C {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int k = in.readInt();
            char car[] = in.readLine().toCharArray();
            //solving for a
            int ans = Integer.MIN_VALUE;
            int length = 0;
            int ki = k;
            Vector<Integer> changind = new Vector<Integer>();
            for (int i = 0; i < car.length; i++) {
                if (car[i] == 'a') {
                    length++;
                    ans = Math.max(ans, length);
                }
                else {
                    if (ki > 0) {
                        ki--;
                        changind.add(i);
                        length++;
                        ans = Math.max(ans, length);
                    }
                    else {
                        ans = Math.max(ans, length);
                        ki++;
                        if (changind.size() > 0 && ki <= k) {
                            int f = changind.get(0);
                            changind.remove(0);
                            length = i - f - 1;
                            i--;
                        }
                        else{
                            ki--;
                            length = 0;
                        }
                    }
                }
            }
            changind.clear();
            ki = k;
            length = 0;
            for (int i = 0; i < car.length; i++) {
                if (car[i] == 'b') {
                    length++;
                    ans = Math.max(ans, length);
                } else {
                    if (ki > 0) {
                        ki--;
                        changind.add(i);
                        length++;
                        ans = Math.max(ans, length);
                    } else {
                        ans = Math.max(ans, length);
                        ki++;
                        if (changind.size() > 0 && ki <= k) {
                            int f = changind.get(0);
                            changind.remove(0);
                            length = i - f - 1;
                            i--;
                        }
                        else{
                            ki--;
                            length = 0;
                        }
                    }
                }
            }
            System.out.println(ans);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
