package Strings;

import java.util.Scanner;

public class NameHasa {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for 1-7");
        int day =input.nextInt();
        String dayString = " ";
        boolean valid = true;

        switch (day) {
            case 1:
                dayString = "Sunday";
                break;
            case 2:
                dayString ="Monday";
                break;
            case 3:
                dayString =" Tuesday";
                break;
            case 4:
            dayString =" Wednesday";
            break;
            case 5:
                dayString ="Thursday";
                break;
            case 6:
            dayString ="Friday";
            break;
            case 7:
            dayString ="Saturday";
            break;
            default:
                System.out.println("Invalid day number");


        }


    }
}
