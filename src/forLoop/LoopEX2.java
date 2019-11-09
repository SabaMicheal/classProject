package forLoop;

public class LoopEX2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while (i <= 19) {
            sum = sum + i;
            System.out.print(sum + " ");
            i = i + 2;
            int num = 0;
            for (int l = 1; i <= 19; i = i + 2) {
                sum = sum + i;
                System.out.print(sum + " ");
            }

        }
    }
}