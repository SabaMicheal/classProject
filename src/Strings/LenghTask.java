package Strings;

import java.util.Scanner;

public class LenghTask {

    private static  void maim(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a message");
        String message = input.nextLine();

        if(message.isEmpty()) {
            System.out.println("message is empty");
        } else if (message.length() >= 10) {
            System.out.println("message is good");
        } else {
            System.out.println("Message is too short");


        }
    }
}
