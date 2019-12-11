package acadamy.learnprgramming;

import java.util.Scanner;

public class VARIABLE {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int firstNumber =2;
        int secondNumber =5;
        var substraction =7;
        int answer;
        String prompt = ". press ENTER when ready";

        System.out.println("Think of a number between 1 and 10" + prompt);
        scanner.nextLine();
        System.out.println("Multiply your number by " + firstNumber + prompt);
        scanner.nextLine();
        System.out.println("Now multiply the result by " + secondNumber + prompt);
        scanner.nextLine();
        System.out.println("Divide the result by number you originally thought of " + prompt);
        scanner.nextLine();
        System.out.println("Now subtract " + substraction + prompt);
        scanner.nextLine();

        answer = firstNumber + secondNumber - substraction;
        System.out.println("The answer is " + answer);


    }
}
