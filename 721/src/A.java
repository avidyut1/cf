import java.io.*;
import java.util.*;
import java.math.*;

public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            char car[] = (in.readLine()).toCharArray();
            Queue<Integer> q = new LinkedList<Integer>();
            for (int i = 0; i < car.length ; i++) {
                if (car[i] == 'B') {
                    int j = i;
                    while(j < car.length && car[j] == 'B') {
                        j++;
                    }
                    int count = j - i;
                    i = j - 1;
                    q.add(count);
                }
            }
            System.out.println(q.size());
            while(!q.isEmpty()) {
                System.out.print(q.poll()+ " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
