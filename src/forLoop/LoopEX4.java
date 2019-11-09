package forLoop;

public class LoopEX4 {

    public static void main(String[] args) {
        System.out.print("1");
        int i = 2;
        while (i <= 20) {
            System.out.print(" + " + i);i++;
            System.out.print("1");
            for (int j = 2; i <= 20; i++) {
                System.out.print(" + " + i);
            }
        }
    }
}
