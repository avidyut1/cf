import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            char car[] = in.readLine().toCharArray();
            int cu = 0, cd = 0, cl = 0, cr = 0;
            if (car.length % 2 != 0) {
                System.out.println(-1);
                return;
            }
            for (int i = 0; i < car.length; i++) {
                if (car[i] == 'L') {
                    cl++;
                }
                if (car[i] == 'R') {
                    cr++;
                }
                if (car[i] == 'U') {
                    cu++;
                }
                if (car[i] == 'D') {
                    cd++;
                }
            }
            int difflr = Math.abs(cl - cr);
            int diffud = Math.abs(cu - cd);
            if (difflr % 2 == 0 && diffud % 2 == 0) {
                System.out.println(difflr / 2 + diffud / 2);
            }
            else if (difflr == diffud) {
                System.out.println(difflr);
            }
            else {
                System.out.println((difflr + diffud) / 2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
