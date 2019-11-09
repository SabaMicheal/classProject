package Strings;

import java.util.Scanner;

public class TaskIndex {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        String str = "Cybertek is Located in Des Plaine";
        String word = input.nextLine();
        int index =str.indexOf(word);
        System.out.println(index);
    }
}
