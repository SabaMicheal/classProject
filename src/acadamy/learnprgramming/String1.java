package acadamy.learnprgramming;

public class String1 {
    public static void main(String[] args){
        String courseName = "Lear java ofr Beginner Crash Corse";
        String message = "Welcome to";
// concatenate
        String fullMessage = message + courseName;
    System.out.println(fullMessage);

    //use string format
        String fullMessages3 = String.format("%s%s" , message, courseName);
        System.out.println(fullMessages3);

        //use printf
        System.out.printf("Hello, and %sthe %s.%n" , message, courseName);

        for (int i = 0; i< 37; i++) {
            char character = courseName.charAt(i);
            System.out.println(character);

        }
    }
}
