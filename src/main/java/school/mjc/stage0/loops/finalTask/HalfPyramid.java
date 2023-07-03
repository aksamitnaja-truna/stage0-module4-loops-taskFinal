package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        int len = 2 * cathetusLength - 1, i_len, side, increment;
        for (int i = 1; i <= cathetusLength; i++){
            i_len = 2 * i - 1;
            side = (len - i_len) / 2;
            increment = 0;
            for (int j = 1; j <= cathetusLength; j ++){
                if (j > side && j <= cathetusLength)
                    System.out.print("*");

                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
