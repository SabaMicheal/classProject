package SwitchStatements;

import java.util.Random;

public class Newtask0 {

    public static void main(String[] args){
        Random random = new Random();
        int number =random.nextInt(26);
        System.out.println("Rondom Num: " + number);
        number += 65;

        char letter = (char) number;
        System.out.println("My number is " + number);
        System.out.println("Your letter is " + letter);
    }
}



