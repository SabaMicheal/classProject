package SwitchStatements;

public class Age {

    public static void main(String[] args){
        int age;
        age = 4;
        switch(age){
            case 1:
                System.out.println("You can crawl");
                break;
            case 2:
                System.out.println("You can talk");
                break;
            case 3:
                System.out.println("You can get in toruble");
                break;
            default:
                System.out.println("i dont know how old you are");

        }
    }
}