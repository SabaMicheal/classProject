package Method;

public class multipleData {
     public static void main(String[] args) {
         printName("james");
//
//        printName("adam");
//
//        firstChar("hsdhfsdhsdf");
         goTo("london","china");
         makeEmail("Sara","bond",24);
     }
    public static void printName(String name) {
        System.out.println(name);
    }
    public static void firstChar(String name) {
        System.out.println(name.charAt(0));
    }
    public static void goTo(String origin, String newLocation) {
        System.out.println("You start from " + origin);
        System.out.println("And you're going to " + newLocation);
    }
    public static void makeEmail(String firstName, String lastName, int age) {
        String email = firstName + age + lastName + "@cybertek.com";
        System.out.println(email);
    }
}
//Create a void method name countWords that will accept a String as an argument. Print the following:
//“The number of words in the sentence is: numberOfWords”