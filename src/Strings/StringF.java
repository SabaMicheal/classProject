package Strings;

import java.util.Scanner;

public class StringF {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter two words(separate with space):");
        String str3 = input.nextLine();
        str3 = str3.toLowerCase();
        System.out.println(str3.length() - 1);
        System.out.println(str3.substring(0, 1).toUpperCase() + str3.substring(1, str3.indexOf(" ")) + " " + str3.substring(str3.indexOf(" ") + 1, str3.indexOf(" ") + 2).toUpperCase() + str3.substring(str3.indexOf(" ") + 2));
        }
    }

