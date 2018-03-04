import java.util.Arrays;

public class Maiт {

    public static void main(String[] args) {
        int[][] mass = new int[4][2];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                mass[i][j] = i + j;
            }
        }

        for (int[] ints : mass) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println(Arrays.deepToString(mass));
        }
    }
}
