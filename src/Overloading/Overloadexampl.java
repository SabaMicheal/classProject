package Overloading;
import java.util.Arrays;
public class Overloadexampl {

  public static void main(String[] args) {
        int []a = {3};
        maxNumber(a,4,2,40,12,4,2,23,7);
    }
    public static void maxNumber(int [] a, int ... arr) {
        Arrays.sort(arr);
        System.out.println("The biggest number is " + arr[arr.length-1]);
    }

//Create a method that will accept an int array. Add up all the numbers in
// your array, except for numbers that end with 5.
//Overload your method to take an int array and a number. Now return
// the sum of all the numbers, except for the numbers that end with the given number.
//new messages
     }
