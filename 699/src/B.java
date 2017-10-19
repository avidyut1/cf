import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int m = in.readInt();
            char car[][] = new char[n][m];
            for (int i = 0; i < n; i++) {
                car[i] = in.readLine().toCharArray();
            }
            int total = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if(car[i][j] == '*') {
                        total++;
                    }
                }
            }
            int countop[][] = new int[n][m];
            int countbottom[][] = new int[n][m];
            int countleft[][] = new int[n][m];
            int countright[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    countleft[i][j] = j - 1 >= 0 ? countleft[i][j - 1] : 0;
                    if(car[i][j] == '*') {
                        countleft[i][j]++;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = m - 1; j >= 0; j--) {
                    countright[i][j] = j + 1 < m ? countright[i][j + 1] : 0;
                    if(car[i][j] == '*') {
                        countright[i][j]++;
                    }
                }
            }
            for (int j = 0; j < m; j++) {
                for (int i = 0; i < n; i++) {
                    countop[i][j] = i - 1 >= 0 ? countop[i - 1][j] : 0;
                    if(car[i][j] == '*') {
                        countop[i][j]++;
                    }
                }
            }
            for (int j = 0; j < m; j++) {
                for (int i = n - 1; i >= 0; i--) {
                    countbottom[i][j] = i + 1 < n ? countbottom[i + 1][j] : 0;
                    if(car[i][j] == '*') {
                        countbottom[i][j]++;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int val = countbottom[i][j] + countop[i][j] + countleft[i][j] + countright[i][j];
                    if(car[i][j] == '*') {
                        val -= 3;
                    }
                    if( val == total) {
                        System.out.println("YES");
                        System.out.println((i+1)+ " " + (j + 1));
                        return;
                    }
                }
            }
            System.out.println("NO");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
