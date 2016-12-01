import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int m = in.readInt();
            int stage[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    stage[i][j] = in.readInt();
                }
            }
            int ans = 0;
            boolean right[][] = new boolean[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = m - 1; j >= 0; j--) {
                    right[i][j] = (j + 1 < m) ? right[i][j + 1]: false;
                    if (stage[i][j] == 1) {
                        right[i][j] = true;
                    }
                }
            }
            boolean left[][] = new boolean[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    left[i][j] = (j - 1 >= 0) ? left[i][j - 1]: false;
                    if (stage[i][j] == 1) {
                        left[i][j] = true;
                    }
                }
            }
            boolean top[][] = new boolean[n][m];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    top[j][i] = (j - 1 >= 0) ? top[j - 1][i]: false;
                    if (stage[j][i] == 1) {
                        top[j][i] = true;
                    }
                }
            }
            boolean bottom[][] = new boolean[n][m];
            for (int i = 0; i < m; i++) {
                for (int j = n - 1; j >= 0; j--) {
                    bottom[j][i] = (j + 1 < n) ? bottom[j + 1][i]: false;
                    if (stage[j][i] == 1) {
                        bottom[j][i] = true;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (stage[i][j] == 1) {
                        continue;
                    }
                    if(top[i][j]) {
                        ans++;
                    }
                    if(bottom[i][j]) {
                        ans++;
                    }
                    if(left[i][j]){
                        ans++;
                    }
                    if(right[i][j]){
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
