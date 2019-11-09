package Method;
public class lengthLogic {

    public static void main(String[] args) {
        if (loginMethod("james123", "password")) {
            System.out.println("logged in");
        } else {
            System.out.println("invalid credentials");
        }
    }

    public static boolean loginMethod(String username, String password) {
        String validUsername = "james123";
        String validPassword = "password";
        if (validUsername.equals(username) && validPassword.equals(password)) {
            return true;
        }
        return false;
    }
}






//Create a method for logging in. User passes the username
// and password as parameters. If the passed values are the same
// as the given username and password return true, but if either
// the username or password is invalid return false
//Username: james123
//Password: password


//  if(num <0) {
//            return  0;
//        } else {
//            return num;
//        }
//
//    }
//    public static void main(String[]args) {
//        System.out.println("Negative number" +checkNumber(-4));
//        System.out.println("Positive" + checkNumber(4));
//