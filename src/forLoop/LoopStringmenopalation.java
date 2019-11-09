package forLoop;

import java.util.Scanner;

public class LoopStringmenopalation {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);


        Scanner input = new Scanner(System.in);
        String number = input.nextLine();
        boolean validLength = false;
        if(number.length() == 10) {
            validLength = true;
        } else if(number.length() == 12) {
            if(number.charAt(0) == '(' && number.charAt(4)== ')') {
                validLength = true;
                number =   number.replace("(","").replace(")","");
            }
        }
        // We check the length so far
        // if valid length we will check if all are numbers
        // if invalid length don't check
        int count = 0;
        if(validLength) {
            for(int i= 0; i < number.length(); i++) {
                // if (number) -> store
                char num = number.charAt(i);
                if(num >= 48 && num <= 57) {
                    count++;
                }
            }
            if(count == number.length()) {
                System.out.println("Valid Number");
            } else {
                System.out.println("Invalid Number");
            }
        } else {
            System.out.println("Invalid number format");
        }
    }
}           //Imporetant Note
                 //Character.isDigite(char c);
                 //its Return boolen
