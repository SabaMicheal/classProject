package forLoop;

import java.util.Scanner;

public class TaskLoop {
    public static void main(String[] agrs) {
        Scanner input = new Scanner(System.in);
        String password ="secret478";
      for(; ;) {
        System.out.println("Enter your Pasword");
        String userPass =input.nextLine();

        if(password.equals(userPass)) {
            System.out.println("Welcome to your profile");
        }



        }

    }
}
