import java.io.*;
import java.util.*;
import java.math.*;
public class A {
    public static void main(String[] args) {
        try{
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            char bus[][] = new char[n][5];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 5; j++) {
                    char c = in.readCharacter();
                    bus[i][j] = c;
                }
            }
            boolean ans = false;
            for (int i = 0; i < n; i++) {
                if (bus[i][0] == 'O' && bus[i][1] == 'O'){
                    ans = true;
                    bus[i][0] = '+';
                    bus[i][1] = '+';
                    break;
                }
                if (bus[i][3] == 'O' && bus[i][4] == 'O'){
                    ans = true;
                    bus[i][3] = '+';
                    bus[i][4] = '+';
                    break;
                }
            }
            if (ans) {
                System.out.println("YES");
                for (int i = 0; i < n; i++) {
                    System.out.println(bus[i]);
                }
            }
            else
                System.out.println("NO");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
