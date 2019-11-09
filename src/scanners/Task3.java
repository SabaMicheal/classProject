package scanners;
import java.util.Scanner;

public class Task3 {
    public static void main( String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you age:");
        int givenAge = 65;
        int result=65-givenAge;
        System.out.println("Because you are" +givenAge+ "years old and will retire in "+result+"year old" );

    }
}
