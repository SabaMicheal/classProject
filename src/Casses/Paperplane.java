package Casses;

public class Paperplane {

    public static void main(String[] args) {

        // Create 2 Flag objects
        // Set all values to first one only
        // and copy first objects instance variable values to second one
        // and reset/reassign the first objects values to zero to numbers
        // and "a" to Strings.
        Flag flag1 = new Flag();
        Flag flag2 = new Flag();
        flag1.country = "Argentina";
        flag1.color = "Sky Blue";
        flag1.size = 123;
        flag1.materials = "Plastic";

        flag2.country = flag1.country;
        flag2.color = flag1.color;
        flag2.size = flag1.size;
        flag2.materials = flag1.materials;

        flag1.country = "a";
        flag1.color = "a";
        flag1.size = 0;
        flag1.materials = "a";

        flag1.info();
        flag2.info();

        // upgrade flag1 to 255 and gold.
        flag1.upgrated(255, "Gold");
        flag1.info();

    }
}
