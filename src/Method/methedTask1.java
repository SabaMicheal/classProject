package Method;

import java.util.Scanner;

public class methedTask1 {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter some String");
         String str = input.nextLine();
         countWords(str);
     }
    public static void countWords (String str) {
        String [] arr = str.trim().split(" ");
        System.out.println("The number of words in the sentence is " + arr.length);
    }
}
//Create a void method name countWords that will accept a String as an argument. Print the following:
//“The number of words in the sentence is: numberOfWords