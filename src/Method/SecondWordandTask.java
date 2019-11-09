package Method;

import java.util.Scanner;
import java.util.Arrays;
public class SecondWordandTask {

    public static void main(String[] args) {
        //    System.out.println(giveWords("day","night"));
        System.out.println(giveWords("day", "night", -3));
    }
    public static String giveWords(String first, String second) {
        return first+second+first;
    }
    public static String giveWords(String first, String second, int times) {
// Only need this condition with substring
//        if(times <= 0) {
//            return "";
//        }
        String word = "";
        for(int i = 0; i < times; i++) {
            word += first;
            if(i == times -1) {
                break;
            }
            word += second;
        }
        return word;
    }
    {
    }
}

        //  return word.substring(0,word.length() - second.length());
            //  {

    //Create a method that will accept two Strings. Return a new String that has the firstWord then the secondWord and then the firstWord again
        //> input: “day”, “name”
        //> output: “daynameday”