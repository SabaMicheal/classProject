package Method;
import java.util.Arrays;
public class Task1Overload {


    public static String[] increaseArray(String[] arr, String word, int index) {

        String[] newArr = new String[arr.length + 1];

        for (int i = 0, j = 0; j < newArr.length; j++) {

            if (index == j) {
                newArr[j] = word;
            } else {
                newArr[j] = arr[i];
                i++;
            }

        }

        return newArr;

    }
}


//Old tasks: Create a method that will take a String array and a String.
// Increase your array capacity and add the given String as the last
// element of the new array. Return the new array