package forLoop;

import java.util.Scanner;

public class LoopPrintDymend {
    public static void main(String[]agrs){
        Scanner input=new Scanner(System.in);////need to inter any number

        int user = input.nextInt();
        int a = user -1;
        for(int i = 0; i < user; i++){
            for(int j = 0; j < a - i; j ++) {
                System.out.print(" ");
                 System.out.println();

        }
    }
}
}
