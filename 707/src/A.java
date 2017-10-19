import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int m = in.readInt();
            char car[][] = new char[n][m];
            boolean ans = true;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    car[i][j] = in.readCharacter();
                    if (car[i][j] == 'B' || car[i][j] == 'W' || car[i][j] == 'G') {
                        continue;
                    }
                    else {
                        ans = false;
                    }
                }
            }
            if (ans) {
                System.out.println("#Black&White");
            }
            else {
                System.out.println("#Color");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
