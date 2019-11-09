package Strings;

import java.util.Scanner;

public class Accanuntnumber11 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter account number");

        String account = input.nextLine();
        if(account.charAt(0) == '2') {
            if(account.length() == 7) {
                System.out.println("valid 2 account");
            } else {
                System.out.println("invalid 2 account");
            }
        } else if(account.charAt(0) == '5') {
            if(account.length() == 10) {
                System.out.println("valid 5 account");
            } else {
                System.out.println("invalid 5 account");
            }
        } else {
            System.out.println("Invalid account number");
        }
    }
}
      // Its other way to do it
      // boolean check = account.startsWith("2") && account.length() == 7;
      // boolean check2 = account.startWith("5) && account.length() == 10;

      //        if(check || check2) {
      //            System.out.println("valid");
      //        } else {
      //            System.out.println("invalid");
      //        }
