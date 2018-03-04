import java.util.Arrays;

public class Maiт {

    public static void main(String[] args) {
        int[][] mass = new int[4][2];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                mass[i][j] = i + j;
            }
        }

        System.out.println(Arrays.deepToString(mass));
    }
}
