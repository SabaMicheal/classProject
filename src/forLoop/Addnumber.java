package forLoop;

public class Addnumber {
    public static void main(String[] arg) {
        int i = 1;
        while (i <= 19) {
            System.out.print(i * i + " ");
            i = i + 2;
            for (int k = 1; i <= 19; i = i + 2) {
                System.out.print(i * i + " ");
            }
        }
    }
}

