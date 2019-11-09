package SwitchStatements;

public class Apple {

    public static void main(String[] args) {
        class StringSwitch {

        }
        String fruit = "Banana";
        switch (fruit) {
            case "oranges":
                System.out.println("Oranges are sweet");
                break;
            case "banana":
            case "apple":
                System.out.println("My favorite");
                break;
            default:
                System.out.println("Not a fruit");


        }


    }
}