package SwitchStatements;

import java.util.*;

public class Task10 {


        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter the letter grade");
            char grade = input.nextLine().charAt(0);
            switch (grade) {
                case 'a':
                case 'A':
                    System.out.println("Excellent!");
                    break;
                case 'b':
                case 'B':
                    System.out.println("Great!");
                    break;
                case 'c':
                case 'C':
                    System.out.println("Okay");
                    break;
                case 'd':
                case 'D':
                    System.out.println("You can do better");
                    break;
                case 'f':
                case 'F':
                    System.out.println("Something needs to change");
                    break;
                default:
                    System.out.println("Not a valid letter grade");
            }

    }
}
