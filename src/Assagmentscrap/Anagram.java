package Assagmentscrap;
import java.util.Arrays;
public class Anagram {

        public  boolean isAnagram(String word1, String word2){
            boolean result= false;
            int count =0;
            String [] n1 = word1.split("");
            String [] n2 = word2.split("");
            int len = n1.length;
            int len2= n2.length;
            Arrays.sort(n1);
            Arrays.sort(n2);
            if (len!=len2){
                return result;
            }else  {
                for (int i = 0; i < n1.length; i++) {
                    if (n1[i].equals(n2[i]) ) {
                        count++;
                    }
                }
                if (count==n1.length){
                    result=true;
                }
            }
            return result;
        }
    }


