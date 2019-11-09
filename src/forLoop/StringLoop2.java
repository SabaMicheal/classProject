package forLoop;

import java.util.Scanner;

public class StringLoop2 {
    public static void main(String[] agrs) {
        Scanner input = new Scanner(System.in);
        String password = "secret478";
        int attempts = 0;
        for (; ; attempts++) {
            if (attempts == 2) {
                System.out.println("Your account is locked");
                break;
            }
            System.out.println("Enter the password");
            String userPass = input.nextLine();

            if(password.equals(userPass)) {
                System.out.println("Welcome to your profile");
            }

            }
        }
    }
