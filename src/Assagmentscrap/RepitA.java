package Assagmentscrap;

import java.util.Scanner;

public class RepitA {
    public static void main(String[] args) {
        System.out.println("Please enter:");
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();

        if (n.contains("a") && n.length() < 5) {
            System.out.println("A Perfect");
        } else if (n.contains("a") && n.contains("b") && n.length() <= 10 && n.length() >= 7) {
            System.out.println("B Perfect");
        } else if (!(n.contains("a")) && (!(n.length() <= 10) && (n.length() >= 7))) {
            System.out.println("Perfect");

        } else if (n.contains("a") && n.length() < 7 || n.length() > 10) {
            System.out.println("");
        } else {
           //System.out.println("Sorry");
           System.out.println("the volue of a");

        }
    }
}