import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            char ar[] = in.readLine().toCharArray();
            int ac = 0, dc = 0;
            for (int i = 0; i < n; i++) {
                if (ar[i] == 'A'){
                    ac++;
                }
                else {
                    dc++;
                }
            }
            if (ac > dc) {
                System.out.println("Anton");
            }
            else if(ac < dc) {
                System.out.println("Danik");
            }
            else{
                System.out.println("Friendship");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
