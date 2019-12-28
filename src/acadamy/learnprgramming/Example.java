package acadamy.learnprgramming;

public class Example {

        public static void main(String[] args) {
            int y = 12;
            int z;

            z = addOne(y);

            System.out.printf("%d, %d", y, z);
        }

        public static int addOne(int x) {
            x = x + x;
            return x;
        }

}
