package StoreAndRead;
public class BiggestCarracterPrint {

    public static void main(String[] args) {

        String str = "Write a program that creates a group of given size thisisabigword";
        String[] arr = str.trim().split(" ");
        int biggestLength = 0;
        String biggestWord = "";
        for (String word : arr) {
            if (word.length() > biggestLength) {
                biggestLength = word.length();
                biggestWord = word;
            }
        }
        System.out.println(biggestWord);

//            for(String word: arr) {
//            if(word.length() == biggestLength) {
//                System.out.println(word);
//            }
    }
    {

    }
}
// ven the String:
//"Write a program that creates a group of given size "thisisabigword”
//Find the biggest word in your String and print it.
//    String [] regular = str.trim().toLowerCase().split(" ");
//    char [] charArr = str.toCharArray();
//    System.out.println(Arrays.toString(charArr));
//    System.out.println(Arrays.toString(regular));