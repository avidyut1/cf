import java.io.*;
import java.util.*;
import java.math.*;

public class D {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int m = in.readInt();
            int k = in.readInt();
            char ar[][] = new char[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    ar[i][j] = in.readCharacter();
                }
            }
            boolean v[][] = new boolean[n][m];
            Vector<Lake> lakes = new Vector<Lake>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (ar[i][j] == '.' && !v[i][j]) {
                        Vector<Point> points = new Vector<Point>();
                        boolean ocean = dfs(ar, i, j, v, points);
                        if (!ocean) {
                            lakes.add(new Lake(points));
                        }
                    }
                }
            }
            Collections.sort(lakes);
            int remove = lakes.size() - k;
            char ans[][] = ar;
            int cellans = 0;
            for (int i = 0; i < remove; i++) {
                Lake l = lakes.get(i);
                for (Point p : l.points) {
                    ans[p.x][p.y] = '*';
                    System.out.println(p);
                    cellans++;
                }
            }
            System.out.println(cellans);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(ans[i][j]);
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static boolean dfs(char ar[][], int x, int y, boolean v[][], Vector<Point> points) {
        if (v[x][y]) {
            return false;
        }
        int n = v.length;
        int m = v[0].length;
        if (x < 0 || x >= n || y < 0 || y >= m) {
            return false;
        }
        if (ar[x][y] == '*'){
            return false;
        }
        if (y == 0 && ar[x][y] == '.') {
            return true;
        }
        if (y == m - 1 && ar[x][y] == '.') {
            return true;
        }
        if (x == 0 && ar[x][y] == '.') {
            return true;
        }
        if (x == n - 1 && ar[x][y] == '.') {
            return true;
        }
        v[x][y] = true;
        points.add(new Point(x, y));
        return dfs(ar, x + 1, y, v, points) || dfs(ar, x, y + 1, v, points) || dfs(ar, x - 1, y, v, points) || dfs(ar, x, y - 1, v, points);
    }
}
class Lake implements Comparable<Lake> {
    Vector<Point> points = new Vector<Point>();
    public Lake(Vector<Point> points) {
        this.points = points;
    }
    @Override
    public int compareTo(Lake that) {
        if (this.points.size() < that.points.size()) {
            return -1;
        }
        else if(this.points.size() > that.points.size()) {
            return 1;
        }
        else
            return 0;
    }
    public String toString (){
        String val = "";
        for(Point p: this.points) {
            val += p.toString()+", ";
        }
        return val + "\n";
    }
}
class Point{
    int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return this.x+ " "+this.y;
    }
}
