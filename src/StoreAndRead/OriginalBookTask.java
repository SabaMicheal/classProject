package StoreAndRead;
import java.util.Arrays;
import java.util.Scanner;
public class OriginalBookTask {

    public static void main(String[] args) {

                String [] books = {"Leaders eat last", "Harry potter", "Mindset", "OCA", "Eragon"};
                Arrays.sort(books);
                System.out.println(Arrays.toString(books));
                Scanner input = new Scanner(System.in);
                System.out.println("Enter the book you want to replace");
                String book = input.nextLine();
                int index = Arrays.binarySearch(books,book);
                if(index >= 0) {
                    System.out.println("What book will you replace " + book + " with");
                    String newBook = input.nextLine();
                    books[index] = newBook;
                } else {
                    System.out.println("Book not found");
                }
                System.out.println(Arrays.toString(books));
            }
        }



//Given you have a library of 5 books. Write a program that
// will ask user to enter the name of one of the books.
// If the book is in the library, ask the user what book they replace the
// original book with. If the book the user enters is not
// in the library, print “library not changed”. In both cases
// print out the library for the user to see.

//Note;We can use any data tayp in Arrays:
// in this case index is just a name of position