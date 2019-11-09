package Method;

import java.util.Arrays;
public class NegativeNumber {
    public static void main(String[] args) {

        int [] arr2 = {-1,3,-4,-2,32,2,-23,1};
                printNegativeNumbers(arr2);
            }
            public static void printNegativeNumbers(int [] arr) {
                System.out.println(Arrays.toString(arr));
                for(int num: arr) {
                    if(num < 0) {
                        System.out.println(num);
                    }
                }
            }
        }
//Write a method accepts an int array and a number.
// Replace any negative numbers
// in your array with the given number. Print the array
//Note the 3 dotes it only working for Array
//public static void printNegeativeNumbersnumbers(int ... str) {