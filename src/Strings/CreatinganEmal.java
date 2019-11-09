package Strings;

import java.util.Scanner;
public class CreatinganEmal {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);
        String first = input.nextLine();
        String second = input.nextLine();
        String email ="";
        if(first.length() >= 6 && second.length() >=6) {
            email = first.substring(0,4).toLowerCase();
            email += second.substring(second.length()- 3);
            email += "@cybertek.com";
            System.out.println(email);
        } else {
            System.out.println("Invalid lengths ");
        }
    }
}

