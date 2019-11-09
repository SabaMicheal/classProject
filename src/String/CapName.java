package String;

import java.util.Scanner;

public class CapName {
    public static void mains(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Enter your name");
        String name = input.nextLine();

        String firstLetter = name.substring(0,1);
        firstLetter = firstLetter.toUpperCase();
        String restOfTheWord = name.substring(1).toLowerCase();
        System.out.println(firstLetter+restOfTheWord);
    }
}


