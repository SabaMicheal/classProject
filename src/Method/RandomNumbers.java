package Method;
import java.util.Random;
import java.util.Arrays;
public class RandomNumbers {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(createRandomArray(10, 100)));
    }

    public static int[] createRandomArray(int size, int bound) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            int ran = random.nextInt(bound) + 1;
            arr[i] = ran;
        }
        return arr;
    }
}
//Create a method that will generate a random int array. The method takes the size
// of the array and the bound of the random numbers. Return the random array