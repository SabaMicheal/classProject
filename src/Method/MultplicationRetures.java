package Method;

public class MultplicationRetures {
    public static int checkNumber(int num) {
        if(num <0) {
            return  0;
        } else {
            return num;
        }

    }
    public static void main(String[]args) {
        System.out.println("Negative number" +checkNumber(-4));
        System.out.println("Positive" + checkNumber(4));
    }
}
 // the flow will going from main mated it dosen't mater if its first and second the
//main methed