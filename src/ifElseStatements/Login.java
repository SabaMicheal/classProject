package ifElseStatements;

import javax.swing.*;
import java.util.Scanner;

        public class Login{
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username= "Micheal1";
        String password ="Micheal123";

        System.out.print(" please enter your username");
        String enteredUsername = input.nextLine();

        if(enteredUsername.equals(username)) {
            System.out.print("please enter your password;");
            String enteredpass= input.nextLine();
            if(enteredpass.equals(password)){
                System.out.println("Login successful");

            }
               else {

            }
                   System.out.print("Wrong password");}

            }
            }




