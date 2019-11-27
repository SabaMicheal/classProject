package Casses;

public class Book {
    String title;
    String author;
    int pages;
    public Book(String title) {
        this.title = title;
    }

    public Book(String title, String author) {
        this(title);
        this.author = author;
    }
    public Book(String title, String author, int pages) {
        this(title,author);
        this.pages = pages;
    }
    public void info() {
        System.out.println("Name " + this.title);
        System.out.println("Author " + this.author);
        System.out.println("Pages " + this.pages);
        System.out.println();
    }
}
   // public Book(String name1, String author1, int pages1) {
    // this.name = name1;
     // this.author = author1;
       // this.pages = pages1;


//Create a program that will ask the user
// how many books they have. Then they will
// be asked to enter the book’s title, author,
// and number of pages. Create each book object
// and store them into a Book array.
//Part 2: Loop through your array and print
// the name of all the books;

