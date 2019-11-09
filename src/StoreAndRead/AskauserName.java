package StoreAndRead;

import java.util.Scanner;
import java.util.Arrays;
public class AskauserName {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many times do you want enter");
        int size = input.nextInt();
        input.nextLine();
        String [] names = new String[size];
        for(int i=0; i < names.length; i++) {
            System.out.println("Enter name " + (i+1));
            names[i] = input.nextLine();
        }
        System.out.println(Arrays.toString(names));
    }
}

