package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int total = 1;
        for (int i = 0; i < power; i++){
            total *= numberToPrint;
        }
        System.out.println(total);

    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
