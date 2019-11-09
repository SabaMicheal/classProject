package Assagmentscrap;

import java.util.Scanner;

public class powerOfoneanother {

    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        int first;
        int second;
        int third = 1;

        System.out.print("Enter the base number ");
        first = input.nextInt();

        System.out.print("Enter the power ");
        second = input.nextInt();

        for(int i = 1; i <= second; i++)
        {
            third *= first;
        }

        System.out.println("third: "+ third);
    }
}

