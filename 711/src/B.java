import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            long grid[][] = new long[n][n];
            int rowz = -1, colz = -1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    grid[i][j] = in.readLong();
                    if (grid[i][j] == 0) {
                        rowz = i;
                        colz = j;
                    }
                }
            }
            if (n == 1) {
                System.out.println(1);
                return;
            }
            long sum = 0l;
            for (int i = 0; i < n; i++) {
                if (i == rowz) {
                    continue;
                }
                for (int j = 0; j < n; j++) {
                    sum += grid[i][j];
                }
                break;
            }
            long zrs = 0l;
            for (int i = 0; i < n; i++) {
                zrs += grid[rowz][i];
            }
            long val = sum - zrs;
            grid[rowz][colz] = val;
            long zcs = 0l;
            for (int i = 0; i < n; i++) {
                zcs += grid[i][colz];
            }
            long sumfd = 0l;
            for (int i = 0; i < n; i++) {
                sumfd += grid[i][i];
            }
            long sumsd = 0;
            int r = 0;
            for (int i = n - 1; i >= 0; i--) {
                sumsd += grid[r++][i];
            }
            if (zcs == sum && sumfd == sum && sumsd == sum) {
                long rs = 0l;
                boolean ans = true;
                for (int i = 0; i < n; i++) {
                    rs = 0l;
                    for (int j = 0; j < n; j++) {
                        rs += grid[i][j];
                    }
                    if (rs == sum) {
                        continue;
                    }
                    else {
                        ans = false;break;
                    }
                }
                for (int i = 0; i < n; i++) {
                    rs = 0l;
                    for (int j = 0; j < n; j++) {
                        rs += grid[j][i];
                    }
                    if (rs == sum) {
                        continue;
                    }
                    else {
                        ans = false;break;
                    }
                }
                if (ans) {
                    if (val <= 0) {
                        System.out.println(-1);
                    }
                    else
                        System.out.println(val);
                }
                else
                    System.out.println(-1);
            }
            else{
                System.out.println(-1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
