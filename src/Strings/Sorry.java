package Strings;

import java.util.Scanner;

public class Sorry {
    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);
        String word =("Enter your Name");
        String name = input.nextLine();
        if(name.charAt(0) =='a' || name .charAt(0) == 'z') {
            System.out.println("Cool name");
        } else {

            System.out.println(" not Cool ");
        }


}
}
