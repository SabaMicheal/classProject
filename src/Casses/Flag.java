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

    public void upgrated(int size, String materials) {
        this.size = size;
        this.materials = materials;

    }
}

    //create a method called upgrade. method should accept int for size and
    // String for materials,meted upgrade should reassign the current zie and material with given new values
//Note;to be daynamic upgrade the key word will be add "This."