package forLoop;

import java.util.Scanner;

public class WhileLoopTask23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        {
            Scanner input = new Scanner(System.in);
            int balance = 1500;
            int transBal;
            int dec = 0;
            while (balance > 0) {
                System.out.println("Enter the transaction amount");
                transBal = input.nextInt();
                if (transBal <= balance) {
                    System.out.println("Item purchased");
                    balance -= transBal; // balance = balance - transBal
                    dec = 0;
                } else {
                    System.out.println("Card declined");
                    dec++;
                }
                if (dec == 3) {
                    System.out.println("Card is locked");
                    break;
                }
            }
            if (balance == 0) {
                System.out.println("Your broke");
            }
        }
    }
}
    // Task # 1 Date10/23






