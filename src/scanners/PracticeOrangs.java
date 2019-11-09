package scanners;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class PracticeOrangs {

    public static void main (String[] args){

        Scanner input= new Scanner (System.in);

        System.out.println("How many orangs do you have?");
        int myOrangs =input.nextInt();
        int females= 70;
        int male= 30;
        females *=85;
        male *=45;
        int total =females + male;
        System.out.println(myOrangs-total);

    }
}
