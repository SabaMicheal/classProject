package Casses;

public class FacebookUser {

    String userName;
    String password;
    String name;
    int age;
    int numOfFriends;

    public FacebookUser(String userName, String password) {
        this.userName = userName;

        if (password.contains(userName)) {
            System.out.println("Invalid password");
            this.password = "password";
        } else {
            this.password = password;
        }
    }

    public FacebookUser(String userName, String password, String name) {
        this(userName, password);

        name = name.replace(" ", "");

        boolean valid = true;

        for (int i = 0; i < name.length(); i++) {
            if (!Character.isLetter(name.charAt(i))) {
                valid = false;
                break;
            }
        }

        if (valid) {
            this.name = name;
        } else {
            System.out.println("Invalid name");
            this.name = "no name";
        }

    }

    public FacebookUser(String userName, String password, String name, int age, int numOfFriends) {

        this(userName, password, name);

        if (age < 0) {
            System.out.println("Invalid age");
        } else {
            this.age = age;
        }

        if (numOfFriends < 0 || numOfFriends > 5000) {
            System.out.println("Invalid number of friends");
        } else {
            this.numOfFriends = numOfFriends;
        }
    }
}











//Create a class for a facebook user which has the
// following instance variables: username, password,
// name, age, and number of friends
//Create a constructor which will create a facebook
// user by only taking the username and password.
// If the password contains the username then it
// is not a valid password and should not be saved.
// In this case Print “Password contained username.
// Default password created: ‘password’” and set the
// password for the user to the default value.