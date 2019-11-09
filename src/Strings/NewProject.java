package Strings;

import java.util.Scanner;

public class NewProject {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int numberOfCall;
        double bill=0.0;
        System.out.println("Enter number of calls:");
        numberOfCall = input.nextInt();
        bill=200.0;
        if(numberOfCall<=100 ) {
            System.out.println("Your bill is $ " + bill);
        }
        if (numberOfCall>100 && numberOfCall<100) {
            System.out.println(bill + ((numberOfCall - 100) * 0.60));
        }
        double bill2= (numberOfCall - 100) * 0.50;
        if (numberOfCall>150 && numberOfCall<200) {
            System.out.println(bill + bill2 + (numberOfCall - 100) * 0.50);
        }

    }
    }
