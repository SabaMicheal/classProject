package ForEach;

public class ForEachExample {
    public static void main(String[]args) {
        int[] numbers = {4, 32, 6, 1, 8};
        //Traditional loop
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[1] % 2 == 0) {
                System.out.println(numbers[i]);

            }
        }
        System.out.println();
        //For each loop
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
        String[] names = {"adam", "james","bob"};
        for(String name:names) {
            if(name.contains("a")) {
                System.out.println(name);
            }
        }
    }
}
