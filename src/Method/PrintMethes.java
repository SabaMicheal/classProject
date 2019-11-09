package Method;

public class PrintMethes {
    public static void main(String[] args) {
        sayHello();
        printOddNumber();
    }

    public static void sayHello() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Hello");
        }
    }

    public static void printOddNumber() {
        for (int i = 0; i < 100; i++) {
            if(i% 2==1){
                System.out.println(i);
            }
        }

    }

}
