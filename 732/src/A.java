import java.io.*;
import java.util.*;
public class A {
    public static void main(String[] args) {
        try{
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int k = in.readInt();
            int r = in.readInt();
            for (int i = 1;; i++) {
                if (canBuyWithoutChange(i, k, r)) {
                    out.write(Integer.toString(i));
                    break;
                }
            }
            out.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static boolean canBuyWithoutChange(int n, int k, int r) {
        int price = n * k;
        if (price % 10 == r || price % 10 == 0) {
            return true;
        }
        return false;
    }
}
