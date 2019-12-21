package acadamy.learnprgramming;

import java.util.Scanner;

public class Drenk {

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        String userChoice = "q";
        System.out.println("please choose one of the following options");
        System.out.println("1 - Cappucino");
        System.out.println("2 - Latte");
        System.out.println("3 - Americano");
        System.out.println("4 - Mocha");
        System.out.println("5 - Macchiato");
        System.out.println("6 - Espresso");
        System.out.println("Q - Quit the program");
        do {
            userChoice = scanner.nextLine();
            userChoice = userChoice.toLowerCase();
            System.out.println("You chose" + userChoice);
        } while (!userChoice.equals("q"));


       switch (userChoice){
           case "1" :
               System.out.println("Making Cappucino....");
               System.out.println("Steam the milk");
               System.out.println("Froth the milk ");
               System.out.println("Make espresso ");
               System.out.println("Add the milk to the espresso");
               break;
           case "2" :
               System.out.println("Making Latte... ");
               System.out.println("Make espresso ");
               System.out.println("MSteam the milk");
               System.out.println("Add the milk to the espresso");
               break;
           case  "3" :
               System.out.println("Making the Americano...");
               break;
           case "4" :
               System.out.println("Making Mocha...");
               break;
           case "5" :
               System.out.println("Making Macchiato...");
               break;
           case "6" :
               System.out.println("Making Espresso...");
               break;
           default:
               System.out.println("Returning coins");
               break;


       }

        scanner.close();

        }

    }

