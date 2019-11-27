package Constructor;

public class House {
    // 	Instance variables: type, address, numRooms
    String type;
    String address;
    int numRooms;

    public void info(){
        System.out.println("\nType: " + this.type);
        System.out.println("Address: " + this.address);
        System.out.println("Number of rooms: " + this.numRooms);
    }


}

/*Part I Create a class House 
Instance variables: type, address, numRooms
Methods:nfo: this method should simply print details of house.
info:
Part II
Create a program that asks from user details of the house through console and create object from House.
And print the details of created House.
 */