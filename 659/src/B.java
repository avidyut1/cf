import java.io.*;
import java.util.*;
import java.math.*;

public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            int n = in.readInt();
            int m = in.readInt();
            Vector<Participant> res[] = new Vector[m];
            for (int i = 0; i < m; i++) {
                res[i] = new Vector<Participant>();
            }
            for (int i = 0; i < n; i++) {
                String par[] = (in.readLine()).split(" ");
                Participant p = new Participant(par[0], Integer.parseInt(par[1]), Integer.parseInt(par[2]));
                res[Integer.parseInt(par[1]) - 1].add(p);
            }
            for (int i = 0; i < m; i++) {
                Collections.sort(res[i]);
            }
            for (int i = 0; i < m; i++) {
                if (res[i].size() >= 3 && res[i].get(1).score == res[i].get(2).score) {
                    System.out.println("?");
                }
                else
                    System.out.println(res[i].get(0).name + " " + res[i].get(1).name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Participant implements Comparable<Participant>{
    String name; int region;
    int score;
    public Participant(String n, int r, int s){
        this.name = n;
        this.region = r;
        this.score = s;
    }
    public int compareTo(Participant that) {
        return - this.score + that.score;
    }
}
