package Casses;

public class Flag {
    String country;
    int size;
    String color;
    String materials;

    public void info() {
        System.out.println("Contry; " + country);
        System.out.println("size; " + size);
        System.out.println("color; " + color);
        System.out.println("materials; " + materials);
    }

    public void flap() {
        System.out.println("Flag is flapping");

    }
    // Create a method called upgrade.
    // method should accept int for size and String for material.
    // method upgrade should reassign the current
    // size and material with given new values

    public void upgrade(int size, String material){
        this.size = size;
        this.materials = material;
    }
}
//Note;- if you know its an obeject or not
//if(f2.country == null)