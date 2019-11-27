package Casses;

import javax.naming.Name;

public class Item {
    public String name;
    public double price;
    int size;

    public Item(String item, double price) {
        this.name =name;   //this is a constructer
        this.price = price;

    }

    //overload the Constructor that take 3 parameters to set all 3 instance variables
    public Item(String name, double price, int size) {
        this.name = name;
        this.price = price;
        this.size = size;
        //we can call constructor inside another constructor
        //it is called constructor Chaining;
        //we can do it using keyword 'This' with the Pareantassis
    }

    public void info() {

        System.out.println("\nName:" + name);
        System.out.println("price:" + price);

    }
}

//Create a class Item that has instance variables name and price.
// Create a constructor that sets both the name and the price.
// Create a method that will print the name of the item and the price
// Create a program that will ask user to enter how many items they have.
// Ask from the user to enter all the names and prices of each item. Make an Item
// array that will hold all the items.
// After you have the array loop through it and print the information of


