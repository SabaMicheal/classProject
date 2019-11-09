package Overloading;

public class StringCreatfirstandsecondcaracter {
     static void main(String[] args) {
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
        //  return word.substring(0,word.length() - second.length());
    }

}
/*Create a method that will accept two Strings. Return a new String that has the firstWord then the secondWord and then the firstWord again
> input: “day”, “name”
> output: “daynameday”
Overload the method above to now accept the two Strings and an integer. The integer given tells you how many times your first word should show up in your new String. Your first words need to always be separated by the second word.
 > input: “day”, “name”, 3
> output: “daynamedaynameday"
 */