import java.io.*;
import java.util.*;
import java.math.*;

/**
 * created by asheshvidyut on 15/03/17
 **/
public class B {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            int n = in.readInt();
            Vector<Range> one = new Vector<Range>();
            for (int i = 0; i < n; i++) {
                one.add(new Range(in.readInt(), in.readInt()));
            }
            int m = in.readInt();
            Vector<Range> two = new Vector<Range>();
            for (int i = 0; i < m; i++) {
                two.add(new Range(in.readInt(), in.readInt()));
            }
            Collections.sort(one, new RangeComparatorOne());
            Collections.sort(two, new RangeComparatorTwo());
            int ans1 = two.get(0).l - one.get(0).r;
            Collections.sort(one, new RangeComparatorTwo());
            Collections.sort(two, new RangeComparatorOne());
            int ans2 = one.get(0).l - two.get(0).r;
            out.write(Integer.toString(Math.max(0, Math.max(ans1, ans2))));
            out.newLine();
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Range{
    public int l, r;
    public Range(int l, int r) {
        this.l = l;
        this.r = r;
    }
}

class RangeComparatorOne implements Comparator<Range> {
    public int compare(Range f, Range s) {
        if (f.r < s.r) {
            return -1;
        }
        else if(f.r == s.r) {
            return 0;
        }
        else{
            return 1;
        }
    }
}

class RangeComparatorTwo implements Comparator<Range> {
    public int compare(Range f, Range s) {
        if (f.l > s.l) {
            return -1;
        }
        else if(f.l == s.l) {
            return 0;
        }
        else{
            return 1;
        }
    }
}
