package acadamy.learnprgramming;

public class Repeated {
    public static void main(String[] args) {
        String first = "This is a String";
        String second = new String("This is a String");

        System.out.println(first == second);
        System.out.println(second == first);
        System.out.println(first.equals (second));
        System.out.println(second.equals(second));


        }
    }
