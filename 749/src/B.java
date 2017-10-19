import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int a = in.readInt();
            int b = in.readInt();
            int c = in.readInt();
            int d = in.readInt();
            int e = in.readInt();
            int f = in.readInt();
            out.write("3");
            out.newLine();
            out.write(Integer.toString(c+e-a)+" "+Integer.toString(d+f-b));
            out.newLine();
            out.write(Integer.toString(e+a-c)+" "+Integer.toString(f+b-d));
            out.newLine();
            out.write(Integer.toString(c+a-e)+" "+Integer.toString(d+b-f));
            out.newLine();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
