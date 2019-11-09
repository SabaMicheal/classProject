package Method;

import java.util.Arrays;

public class DoNotuse {
    public static void changeNegativeNumbers(int[] arr, int change) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = change;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
//Write a method that accepts an int array.
// Print out the array using the same format as Arrays.toString method.
// DO NOT USE THE toString() METHOD.
//[element, element, element]