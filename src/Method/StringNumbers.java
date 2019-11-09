package Method;

public class StringNumbers {
     public static void main(String[] args) {

     }
         public static void arraysToString(int [] arr) {
             //output: [10,9,5,4,3,7,4]
             String result = "[";

             for(int num : arr) {
                 result += num + ", ";
             }

             result = result.substring(0,result.length()-2) + "]";
             System.out.println(result);

         }
}
//Write a method that will take a String of numbers
// (9843263 for example) and an int. Add that second given
// number to each other number and show each
// operation result as separate elements of an int array