package forLoop;
import java.util.Scanner;
public class NamePrint {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i= 0; i < 5; i++) {
            System.out.println("Enter name " + (i+1));
            String name = input.nextLine();
            System.out.println(name);
        }
    }
}

