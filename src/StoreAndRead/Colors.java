package StoreAndRead;
import java.util.Arrays;
public class Colors {
    public static void main(String[] args) {
        String[] colors = {"red", "blue", " yellow", " green"};
        for (int i = 0; i < colors.length; i++) {
            String color = colors[i];
            if (colors[i].length() >= 4) {
                System.out.println(color);
            }
        }
    }
}
