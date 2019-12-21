package acadamy.learnprgramming;

import java.util.Random;
import java.util.Scanner;

public class RockPaper {

    private  static  final int ROCK = 0;
    private  static  final int PAPER = 1;
    private  static  final int SCISSORS = 2;

    public  static  void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);
        Random randomGenerator = new Random();

        String playerChoice;
        int playerValu = -1;
        int computerValue = randomGenerator.nextInt(3);

        System.out.println("Please enter rock, paper or scissors");
        playerChoice = scanner.nextLine().toLowerCase();
        if (playerChoice.equals("rock")) {
            playerValu = ROCK;

        }
        if (playerChoice.equals("paper")) {
            playerValu = PAPER;

        }
        if(playerChoice.equals("scissors")) {
            playerValu = SCISSORS;
        }
        System.out.printf("player chose %s, the vallue is %s.%n ", playerChoice , playerValu);
        scanner.close();
    }

}
