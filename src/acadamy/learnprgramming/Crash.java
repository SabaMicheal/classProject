package acadamy.learnprgramming;

public class Crash {
    public static void main(String[] args){
//        int answer = 7 + 3 * 4;
//        System.out.println(answer);
//
//        int answer2 = (7 + 3) * 4;
//        System.out.println(answer2);
//
//        double radius = 12.0;
//        double area = Math.PI * radius * radius;

        int x = 3;
        int y = x++;
        System.out.printf("Using ++x, x is %s and y is %s.%n" , x, y);

        x = 3;
        y = ++x;
        System.out.printf("Using ++x, x is %s and y is %s.%n" ,x ,y);

        System.out.printf("Don,t do this!");

        x = 3;
        y = ++x - x++;
        System.out.printf("++x - x++ gives; x is %s and y is %s.%n" ,x ,y);

        x = 3;
        y = x++ - ++x;
        System.out.printf("x++ - ++x gives; x is %s and y is %s.%n" ,x ,y);


    }
}


