package forLoop;

import java.util.Scanner;

public class LoopAsknumberTask3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two number");
        int num1 = input.nextInt();
        int num2= input.nextInt();
        int sum =0;
        for(int i = num1; i<=num2;i++) {
            sum += i;

        }
        System.out.print("The sum of " + num1 + " to " + num2 +" is " + sum);
    }
}