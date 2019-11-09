package ForEach;
import java.util.Scanner;
import java.util.Arrays;
public class Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for (int i = 1; i < inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        //TODO. Write you code below this line.
        int sum = 1;
        int count = 1;

        System.out.println("Day " + count++ + " " + Arrays.toString(inhabitants));

            sum = 0;
            for (int i = 1; i < inhabitants.length; i++) {
                inhabitants[i] = inhabitants[i] / 2;
                sum += inhabitants[i];

                if (i <= 8) {
                    System.out.print(i * i + " ");
                    i = i + 2;

                     System.out.println("Day " + count++ + " " + Arrays.toString(inhabitants));


                }while (sum != 1);
                //System.out.println("Day " + count++ + " " + Arrays.toString(inhabitants));

                System.out.println("---- EXTINCT ----");


            }
        }
    }

