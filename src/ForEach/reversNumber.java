package ForEach;
public class reversNumber {
    public static void main(String[]args) {

        int[] firstArray = new int[]{1,2,3,4};
        int[] reversedArray = new int[firstArray.length];
        int j = 0;
        for (int i = firstArray.length -1; i > 0; i--){
            reversedArray[j++] = firstArray[i];
        }
    }
}
