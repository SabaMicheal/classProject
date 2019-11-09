package ForEach;
import java.util.Arrays;
import java.util.Scanner;

public class Nhabitants {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] inhabitants = new int[8];
        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }
        //TODO. Write you code below this line.

        int sum = 0;
        int count =0;
        System.out.println("Day " + count++ + " " + Arrays.toString(inhabitants));
        do {
            sum = 0;
            for (int i = 0; i < inhabitants.length; i++) {
                if (inhabitants[0] == 0) {
                    inhabitants[1] = inhabitants[1] / 2;
                }
                for(int j =0; j<inhabitants.length; j++);
                if (inhabitants[7] == 0) {
                    inhabitants[6] = inhabitants[6] / 2;
                }
                if (i < (inhabitants.length - 1) && i >= 1) {
                    inhabitants[i + 1] = inhabitants[i + 1] / 2;
                    inhabitants[i - 1] = inhabitants[i - 1] / 2;
                }
                sum += inhabitants[i];
                //System.out.println("Day " + count++ + " " + Arrays.toString(inhabitants));
              }
              System.out.println("Day " + count++ + " " + Arrays.toString(inhabitants));
          }
         while (sum != 1) ;
         System.out.println("---- EXTINCT ----");
       }
   }


//An array inhabitants represents cities and their respective populations. For example, the following arrays
// shows 8 cities and their respective populations:
//[3, 6, 0, 4, 3, 2, 7, 1]
//Some cities have a population of 0 due to a pandemic zombie disease t
// hat is wiping away the human lives.After each day, any city that is adjacent
// to a zombie-ridden city will lose half of its population.
//Write a program to loop though each city population and make it
// lose half of its population if it is adjacent(right or left) to a
// city with zero people until all cities have no humans left.
//Day 0 [3, 6, 0, 4, 3, 2, 7, 0]
//Day 1 [3, 3, 0, 2, 3, 2, 3, 0]
//Day 2 [3, 1, 0, 1, 3, 2, 1, 0]
//Day 3 [3, 0, 0, 0, 3, 2, 0, 0]
//Day 4 [1, 0, 0, 0, 1, 1, 0, 0]
//Day 5 [0, 0, 0, 0, 0, 0, 0, 0]
//---- EXTINCT ----