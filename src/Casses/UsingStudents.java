package Casses;

public class UsingStudents {
    public static void main(String[] args) {

        Student studentOne = new Student("james");
        Book book1 = new Book("java","cybertek",20);
        studentOne.read(book1);
        }
    }