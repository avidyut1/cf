import java.io.*;
import java.util.*;
import java.math.*;

public class C {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            char c[] = in.readLine().toCharArray();
            int counter = 0;
            for (int i = 0; i < c.length; i++) {
                if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
                    counter = 0;
                }
                else {
                    counter++;
                }
                if (counter == 2) {
                    if (c[i - 1] == c[i] && c[i] == c[i + 1]) {
                        while(c[i] == c[i + 1]) {
                            i++;
                        }
                        i--;
                        counter = 0;
                    }
                    else if (i + 1 < c.length) {
                        if (c[i + 1] != 'a' || c[i + 1] != 'e' || c[i + 1] != 'i' || c[i + 1] != 'o' || c[i + 1] != 'u') {
                            out.write(" ");
                            counter = 0;
                        }
                    }
                }
                out.write(c[i]);
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
