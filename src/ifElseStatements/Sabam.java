package ifElseStatements;

import java.util.Scanner;

public class Sabam {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("please Enter 3 integers:");

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 > num2 && num1 > 3) {
            System.out.println(" Max number is:" + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(" Max number is:" + num2);

        } else if (num2 > num1 && num2 > num3) {
        } else if (num1 == num2 && num1 == num3) {
            System.out.println("All number are equal ");
        }
    }

}
