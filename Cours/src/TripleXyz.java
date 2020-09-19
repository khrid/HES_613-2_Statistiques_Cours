import java.sql.Array;
import java.util.ArrayList;

public class TripleXyz {
    public static void main(String[] args) {
        int max = 1000;
        int nb = 0;

        for (int x = 1; x < max ; x++) {
            for (int y = x; y < max; y++) {
                for (int z = y; z < max; z++) {
                    if(Math.pow(x,2) + Math.pow(y,2) == Math.pow(z, 2)) {
                        if(pgdc(x,y) == 1) {
                            System.out.println(x + "^2 + " + y + "^2 = " + z + "^2");
                            nb++;
                        }
                    }
                }
            }
        }
        System.out.println(nb);
    }

    public static int pgdc(int a, int b) {
        int r = (b % a);
        if(r == 1 ) return 1;
        if(r == 0) return a;
        return pgdc(r, a);
    }
}
