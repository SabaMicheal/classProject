package Strings;

public class llwerUpper {
    public static void main(String[] arge){
        String word = "jaVa";
        String  fixed = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
        System.out.println(fixed);

        String word2 = "Kevin fell from jos bike";
        int from = word2.indexOf(" from");

        String word3 = word2.substring(0,from);
        System.out.println(word2.substring(from+1) +" " + word3);
    }
}

