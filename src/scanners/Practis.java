package scanners;

import java.util.Scanner;

public class Practis {

    public  static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Please choose one of the following options");
        System.out.print("1 - Cappucino");
        System.out.print("2 - Latte");
        System.out.print("3 - Americano");
        System.out.print("4 - Mocha");
        System.out.print("5 - Macchiato");
        System.out.print("6 - Espresso ");
        System.out.print("6 - Quite the program");

       String userChoice = scanner.nextLine();
       System.out.println("You chose " + userChoice);




        scanner.close();


    }
}
