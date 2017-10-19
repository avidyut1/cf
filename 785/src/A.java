import java.io.*;
import java.util.*;
import java.math.*;

/**
 * created by asheshvidyut on 15/03/17
 **/
public class A {
    public static void main(String args[]) {
        try {
            InputReader in = new InputReader(System.in);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
            Map<String, Integer> map = new HashMap<String, Integer>();
            map.put("Tetrahedron", 4);
            map.put("Cube", 6);
            map.put("Octahedron", 8);
            map.put("Dodecahedron", 12);
            map.put("Icosahedron", 20);
            int n = in.readInt();
            int ans = 0;
            for (int i = 0; i < n; i++) {
                String polygon = in.readLine();
                ans += map.get(polygon);
            }
            out.write(Integer.toString(ans));
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
