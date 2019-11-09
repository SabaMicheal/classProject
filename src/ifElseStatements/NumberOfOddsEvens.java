package ifElseStatements;

import java.util.Scanner;

public class NumberOfOddsEvens {

        public static void main(String[] args) {

            Scanner input= new Scanner (System.in);
            System.out.println("please Enter two double number");

            Double  num1 =input.nextDouble();
            Double num2 =input.nextDouble();
            input.nextLine();
            System.out.print(" Choose opreator from *,-,+,/");
            String operator = input.nextLine();
            if(operator.equals("*")){
                System.out.println("Result of " + num1 + operator + num2 + " is: " + (num1 * num2));
            }
            else if(operator.equals("-")){
                System.out.println("Result of " + num1 + operator + num2 + " is: " + (num1 - num2));
            }
            else if(operator.equals("+")){
                System.out.println("Result of " + num1 + operator + num2 + " is: " + (num1 + num2));
            }
            else if(operator.equals("/")){
                System.out.println("Result of " + num1 + operator + num2 + " is: " + (num1 / num2));
            }
            else {
                System.out.println("Invalid operator entered. Please try again!");
            }
        }
    }


