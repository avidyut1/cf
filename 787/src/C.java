import java.io.*;
import java.util.*;
import java.math.*;

public class C {
    private static int result[][] = new int[2][];
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            Vector<Integer> v[] = new Vector[2];
            for (int i = 0; i < 2; i++) {
                v[i] = new Vector<>();
            }
            for (int i = 0; i < n; i++) {
                int ele = in.readInt();
                for (int j = 0; j < ele; j++) {
                    v[i].add(in.readInt());
                }
            }
            //0 - lose
            //1 - win
            for (int i = 0; i < 2; i++) {
                result[i] = new int[n];
                for (int j = 0; j < n; j++) {
                    result[i][j] = -7;
                }
            }
            for (int i = 0; i < v[0].size(); i++) {
                dfs(0, 1, i, v, n);
            }
            for (int i = 0; i < v[1].size(); i++) {
                dfs(1, 1, i, v, n);
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void dfs(int player, int index, int eleIndex, Vector<Integer> g[], int n) {
        if ((index + g[player].get(eleIndex) + n) % n == 0) {
            result[player][index]++;
        }

    }
}
