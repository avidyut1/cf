import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int m = in.readInt();
            int k = in.readInt();
            Vector<Opertion> vr[] = new Vector[n];
            Vector<Opertion> cr[] = new Vector[m];
            for (int i = 0; i < n; i++) {
                vr[i] = new Vector<Opertion>();
            }
            for (int i = 0; i < m; i++) {
                cr[i] = new Vector<Opertion>();
            }
            for (int i = 0; i < k; i++) {
                int type = in.readInt();
                if (type == 1) {
                    int row = in.readInt() - 1;
                    vr[row].add(new Opertion(i, row, in.readInt()));
                }
                else{
                    int col = in.readInt() - 1;
                    cr[col].add(new Opertion(i, col, in.readInt()));
                }
            }
            for (int i = 0; i < n; i++) {
                Collections.sort(vr[i]);
            }
            for (int i = 0; i < m; i++) {
                Collections.sort(cr[i]);
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (vr[i].size() >= 1 && cr[j].size() >= 1) {
                        Opertion rc = vr[i].get(0);
                        Opertion cc = cr[j].get(0);
                        if (rc.ind > cc.ind) {
                            System.out.print(rc.col+" ");
                        }
                        else{
                            System.out.print(cc.col+" ");
                        }
                    }
                    else if(vr[i].size() >= 1) {
                        Opertion rc = vr[i].get(0);
                        System.out.print(rc.col+" ");
                    }
                    else if(cr[j].size() >= 1) {
                        Opertion cc = cr[j].get(0);
                        System.out.print(cc.col+" ");
                    }
                    else{
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Opertion implements Comparable<Opertion>{
    int ind, row, col;
    public Opertion(int ind, int r, int c){
        this.ind = ind;
        this.row = r;
        this.col = c;
    }
    public int compareTo(Opertion that) {
        return -this.ind + that.ind;
    }
}
