import java.io.*;
import java.util.*;
import java.math.*;

public class C {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            long a = in.readLong();
            long b = in.readLong();
            long f = in.readLong();
            long k = in.readLong();
            long min = Long.MAX_VALUE;
            long low = 0L;
            long high = Integer.MAX_VALUE;
            canComplete(a, b, f, k, 3);
            while(low <= high) {
                long mid = (low + high) >> 1;
                if (canComplete(a, b, f, k, mid)) {
                    min = Math.min(min, mid);
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }
            }
            if (min == Long.MAX_VALUE) {
                min = -1;
            }
            out.write(Long.toString(min));
            out.newLine();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static boolean canComplete(long a, long b, long f, long k, long times) {
        long totalDist = a * k;
        long currentB = b;
        if (currentB < f) {
            return false;
        }
        totalDist -= f;
        currentB -= f;
        while(totalDist > 0) {
            long dist = Math.min(2 * (a - f), totalDist);
            if (dist > currentB) {
                times--;
                currentB = b - dist;
                if (currentB < 0) {
                    return false;
                }
            }
            else {
                currentB -= dist;
                if (currentB < 0) {
                    return false;
                }
            }
            totalDist -= dist;
            if (totalDist <= 0) {
                break;
            }
            dist = Math.min(2 * f, totalDist);
            if (currentB < dist) {
                times--;
                currentB = b - dist;
                if (currentB < 0) {
                    return false;
                }
            }
            else {
                currentB -= dist;
                if (currentB < 0) {
                    return false;
                }
            }
            totalDist -= dist;
        }
        return times >= 0;
    }
}
