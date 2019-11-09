package Strings;

import java.util.Scanner;

public class AgeaskTask8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str =in.nextLine();// "I an x years old"
        int am =str.indexOf("am")+ 3;
        int years = str.indexOf("years");
        String age =str.substring(am,years-1);
        int ageNum = Integer.valueOf(age);
        ageNum += 5;
        System.out.println(" In 5 Years you will be" + ageNum);

}
}
