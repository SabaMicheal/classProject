package varibles;

public class Increment {

    public static void main(String[] arge) {

        int age = 7;
        System.out.println(age); //7
        System.out.println(++age);//8
        System.out.println(age++); //8
        System.out.println(age);

        int X = 11;
        int y = X++;// int y =; then x increments
        System.out.println("X=" + X);
        System.out.println("y=" + y);
        System.out.println(y);



    }

}

