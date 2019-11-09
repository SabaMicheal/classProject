package Strings;
import java.util.Scanner;
public class SecondTaskBoolen {


    public static void main(String[] arges) {
        Scanner input = new Scanner(System.in);
        String month = "October";

        System.out.println("Enter the month");
        String user = input.nextLine();
        boolean check = user.equalsIgnoreCase("october");
        System.out.println(check);
    }}

//        String month1 = user.toLowerCase();
//        System.out.println(month1.equals("october"));
