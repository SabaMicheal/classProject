package Method;
import java.util.Arrays;
public class Capacityand {
    public static void main(String[]args){

    }
    public static String [] increaseArray(String [] arr, String word) {
        String [] newArr = new String[arr.length +1];

        for(int i=0;i < arr.length;i++){
            newArr[i] = arr[i];
        }
        newArr[newArr.length-1] =word;
        return  newArr;

    }
}

//Create a method that will generate a random int array. The method
// takes the size of the array and the bound of the random numbers.
// Return the random array