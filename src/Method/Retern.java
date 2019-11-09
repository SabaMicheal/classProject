package Method;
public class Retern {

    public static int getThree() {
        return 3;
    }
        public static String getDte() {
      String date = "11/3/2019";
      return date;

    }

    public static void main(String [] args) {
        int a = getThree() + 7;
        System.out.print(a);

        String date = getDte().replace("/","");
        System.out.println();
    }

    }


//it always print the main mated
//return its key word
//if we  named of  value buck it should be the same with. " " mark its present as string
//return not give any result.
//after return is not going  to be any hapen