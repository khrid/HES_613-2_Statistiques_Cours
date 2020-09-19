import java.util.concurrent.ThreadLocalRandom;

public class PassageZeroPiece {
    public static void main(String[] args) {
        int moyenne = 0;
        for (int i = 1; i < 10000; i++) {
            moyenne += test(10000) / i;
        }
        System.out.println(moyenne);
    }

    public static int test(int nb) {

        int idx = 0;
        int counter = 0;
        for (int i = 0; i < nb; i++) {
            int coin = ThreadLocalRandom.current().nextInt(0, 1 + 1);
            //int coin = (int)(Math.random() * 2) + 0;
            if (coin == 1) {
                idx++;
            } else {
                idx--;
            }
            if (idx == 0) {
                counter++;
            }
        }
        return counter;
    }
}
