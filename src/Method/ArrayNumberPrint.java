package Method;

import java.util.Arrays;
public class ArrayNumberPrint {

    public static void changeNegativeNumbers(int[] arr, int change) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = change;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}

///Write a method accepts an int array and a number. Replace any negative
//// numbers in your array with the given number. Print the array


