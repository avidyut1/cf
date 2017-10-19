import java.io.*;
import java.util.*;
import java.math.*;

public class D {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int kx = in.readInt();
            int ky = in.readInt();
            final long MAX = Long.MAX_VALUE;
            long diagonal1 = MAX, diagonal2 = MAX, diagonal3 = MAX, diagonal4 = MAX;
            long row1 = MAX, row2 = MAX, row3 = MAX, row4 = MAX;
            char d1 = 'X', d2 = 'X', d3 = 'X', d4 = 'X';
            char r1 = 'X', r2 = 'X', r3 = 'X', r4 = 'X';
            //finind the closest distance point and storing its type
            for (int i = 0; i < n; i++) {
                char piece = in.readCharacter();
                int x = in.readInt();
                int y = in.readInt();
                if (x + y == kx + ky) {
                    int dist = Math.abs(x - kx) + Math.abs(y - ky);
                    if (x > kx && dist < diagonal1) {
                        diagonal1 = dist;
                        d1 = piece;
                    }
                    else if(x < kx && dist < diagonal2) {
                        diagonal2 = dist;
                        d2 = piece;
                    }
                }
                if(x - y == kx - ky) {
                    int dist = Math.abs(x - kx) + Math.abs(y - ky);
                    if (x > kx && dist < diagonal3) {
                        diagonal3 = dist;
                        d3 = piece;
                    }
                    else if(x < kx && dist < diagonal4) {
                        diagonal4 = dist;
                        d4 = piece;
                    }
                }
                if (x == kx) {
                    int dist = Math.abs(x - kx) + Math.abs(y - ky);
                    if (y > ky && dist < row1) {
                        row1 = dist;
                        r1 = piece;
                    }
                    else if(y < ky && dist < row2) {
                        row2 = dist;
                        r2 = piece;
                    }
                }
                if (y == ky) {
                    int dist = Math.abs(x - kx) + Math.abs(y - ky);
                    if (x > kx && dist < row3) {
                        row3 = dist;
                        r3 = piece;
                    }
                    else if(x < kx && dist < row4) {
                        row4 = dist;
                        r4 = piece;
                    }

                }
            }
            boolean ans = false;
            if (d1 == 'Q' || d1 == 'B') {
                ans = true;
            }
            if (d2 == 'Q' || d2 == 'B') {
                ans = true;
            }
            if (d3 == 'Q' || d3 == 'B') {
                ans = true;
            }
            if (d4 == 'Q' || d4 == 'B') {
                ans = true;
            }
            if (r1 == 'Q' || r1 == 'R') {
                ans = true;
            }
            if (r2 == 'Q' || r2 == 'R') {
                ans = true;
            }
            if (r3 == 'Q' || r3 == 'R') {
                ans = true;
            }
            if (r4 == 'Q' || r4 == 'R') {
                ans = true;
            }
            if(ans) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
