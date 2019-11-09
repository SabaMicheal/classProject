package forLoop;

import java.util.Scanner;

public class LoopTasknumberAsk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user = (" Enter your number above 0");
        int num = input.nextInt();
        int start = 0;
        while (start <= num) {
            System.out.println(start++);
        }
    }
}
