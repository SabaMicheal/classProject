package Casses;

import java.util.Scanner;

public class ItemShope {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("How many books do you have");
        int numOfBooks = input.nextInt();
        input.nextLine();
        Book [] library = new Book[numOfBooks];
        for(int i=0; i < library.length; i++) {

            System.out.println("Enter the title of book " + (i+1));
            String title = input.nextLine();

            System.out.println("Enter the author of book " + (i+1));
            String author = input.nextLine();
            System.out.println("Enter the number of pages of book " + (i+1));
            int pages = input.nextInt();
            input.nextLine();
//            Book eachBook = new Book(title,author,pages);
//            library[i] = eachBook;
            library[i] = new Book(title,author,pages);
        }
        for(Book book: library) {
            System.out.println(book.title);
        }
    }

    }
    //Create a class Item that has instance variables name and price.
// Create a constructor that sets both the name and the price.
// Create a method that will print the name of the item and the price
// Create a program that will ask user to enter how many items they have.
// Ask from the user to enter all the names and prices of each item. Make an Item
// array that will hold all the items.
// After you have the array loop through it and print the information of

