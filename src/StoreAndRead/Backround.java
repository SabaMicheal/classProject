package StoreAndRead;

public class Backround {

    public static void main(String[] args){

                System.out.println( backAround( "Hello" ) );
            }

            public static String backAround( String str ) {
                int length = str.length();
                char lastLetter = str.charAt( length - 1 );
                return lastLetter + str + lastLetter;
            }
    {
    }
}