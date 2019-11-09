package Method;
import java.util.Arrays;
public class ReturnToArray {
    public static void main(String[]args){

        String [] arr = {"a","e","i","o"};
        System.out.println(Arrays.toString(increaseArray(arr,"u")));
        System.out.println(Arrays.toString(increaseArrayWithClass(arr,"u")));
    }
    public static String [] increaseArrayWithClass(String [] arr, String word) {
        String [] newArr = Arrays.copyOf(arr, arr.length+1);
        newArr[newArr.length-1] = word;
        return newArr;
    }
    public static String [] increaseArray(String [] arr, String word) {
        String [] newArr = new String[arr.length + 1];
        for(int i=0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length-1] = word;
        return newArr;
    }

    }
//Create a method that will take a String array and a String. Increase
// your array capacity and add the given String as the last element
// of the new array.Return the new array