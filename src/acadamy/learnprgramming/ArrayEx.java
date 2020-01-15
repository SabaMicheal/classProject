package acadamy.learnprgramming;

public class ArrayEx {
    public static void main (String[]args ){
        int [] testResults ;
        testResults = new int [30] ;

        testResults [0] = 87;

        String []daysOfTheWeek = {"Monday" , "Tuesday", "Wednesday" ,"Thursday" , "Friday" } ;

        System.out.println("Test Result: " + testResults[0]);
        System.out.println("Day: " + daysOfTheWeek[2]);
    }
}
