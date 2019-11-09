package forLoop;

import java.util.Scanner;

public class UppercaseLetter {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            char letter = input.nextLine().toUpperCase().trim().charAt(0);
            if(letter >= 65 && letter <= 90) {
                while (letter != 'Z'+1) {
                    System.out.println(letter++);
                }
            } else {
                System.out.println("Not a valid letter");
            }
        }
    }



