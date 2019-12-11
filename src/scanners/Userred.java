package scanners;

import java.util.Scanner;

public class Userred {
    public  static void main(String[]args){
        Scanner scanner = new Scanner(System.in);


       System.out.println("please enter your name");
       String name = scanner.nextLine();
       System.out.println("Hello " + name);
       System.out.println("How old are you");
       var age = scanner.nextInt();
      //int age = Integer.parseInt(scanner.nextLine());
        System.out.println(name + " is " + age + " years old");



    }


}
