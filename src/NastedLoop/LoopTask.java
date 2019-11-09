package NastedLoop;

import java.util.Scanner;

public class LoopTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number ");
        int num = input.nextInt();

        for (int i= 0; i < num; i++) {
            for (int j= 0; j < num; j++) {
                System.out.println("# ");
            }
                System.out.println();
            }
        }
    }


