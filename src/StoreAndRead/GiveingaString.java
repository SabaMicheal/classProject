package StoreAndRead;
public class GiveingaString {

    public static void main(String[]args){

    String [] words= {"Knife","Wooden spoons","plates","cups","forks","pan","pon","transh can","fridge","“dish washer"};
    for(int i=0; i < words.length; i++) {
            if(words[i].trim().contains(" ")) {
                System.out.println(words[i]);
            }
        }
    }
}


