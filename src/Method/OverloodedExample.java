package Method;

public class OverloodedExample {
    public static void main(String[] args) {
        jump(6);
        jump();
        jump(5);
        String[] arr = {"d"};
        System.out.println(jump(arr));
    }

    public static void jump() {
        System.out.println("You don't get far");
    }

    public static void jump(String shoes) {
        System.out.println("The shoes made you go farther");
    }

    public static void jump(int distance) {
        System.out.println("You jumped " + distance);
    }

    public static String jump(String[] arr) {
        return arr[0];
    }

    public static String jump(int[] arr) {
        return "jumped by array";
    }
}
//over loading we can use same name but diff imploument
//in one line string and the next data type if int or number it's work ;
//if is not over loading you can use the same name;Ex.the repsen we use this mothed
//substring and saparate the information.if you are over loaded first u need to change the
//E/quations dose changing the return type overload the method? NO