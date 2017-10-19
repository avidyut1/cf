import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            int m = in.readInt();
            int memory[] = new int[101];
            Arrays.fill(memory,-1);
            for (int i = 0; i < m; i++) {
                int flatNumber = in.readInt();
                int floorNumber = in.readInt();
                memory[flatNumber] = floorNumber;
            }
            int ans = -1;
            Set<Integer> pos = new HashSet<>();
            for (int eachFloor = 1; eachFloor <= 100; eachFloor++) {
                boolean possible = true;
                int floorId[] = new int[101];
                int counter = 0;
                int id = 1;
                for (int i = 1; i < 101; i++) {
                    floorId[i] = id;
                    counter++;
                    if (counter == eachFloor){
                        counter = 0;
                        id++;
                    }
                }
                for (int i = 0; i < 101; i++) {
                    if (memory[i] > 0) {
                        if (floorId[i] != memory[i]) {
                            possible = false;
                        }
                    }
                }
                if (possible) {
                    ans = (n / eachFloor) + 1;
                    pos.add(eachFloor);
                }
            }
            if (n == 1) {
                out.write(Integer.toString(1));
            }
            else if (pos.size() == 1) {
                out.write(Integer.toString(ans));
            }
            else if(memory[n] != -1) {
                out.write(Integer.toString(memory[n]));
            }
            else {
                out.write(Integer.toString(-1));
            }
            out.newLine();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
