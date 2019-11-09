package StoreAndRead;
import java.util.Arrays;
public class SpliteEx {
    public static void main(String[] args) {

        String str = "Java is programming langauge";
        String [] regular = str.trim().toLowerCase().split(" ");
        char [] charArr = str.toCharArray();
        System.out.println(Arrays.toString(charArr));
        System.out.println(Arrays.toString(regular));
    }
}
//7) Given the String:
//"Write a program that creates a group of given size thisisabigword”
//Find the biggest word in your String and print it.