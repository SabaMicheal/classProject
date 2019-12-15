package acadamy.learnprgramming;

import java.text.NumberFormat;

public class Oranges {
    public static void main (String [] args) {

      NumberFormat currenceyFormat = NumberFormat.getCurrencyInstance();
      currenceyFormat.setMinimumFractionDigits(3);

        String apples = "Apples";
       int appleQuantity = 8;
       int applePrince = 100;
       String oranges = " Oranges";
       int orangeQuantity = 12;
       int orangePrince = 80;

//        String column1heading = "Fruit";
//        String column2heading = "Quantity";
//        String column3heading = "Price";
//
//        System.out.printf("%-qws %8s %6s%n", column1heading,column2heading,column3heading);
//        System.out.printf("%-12s %-8d %6s%n", apples,appleQuantity,
//                currenceyFormat.format( applePrince/100.0));
//        System.out.printf("%-12s %-8d %6s%n", oranges, orangeQuantity,
//        currenceyFormat.format(orangePrince /100.0));

        System.out.printf(" PI is %f %n",Math.PI);
        System.out.printf(" PI is %.3f %n",Math.PI);
        System.out.printf(" PI is %.0f %n",Math.PI);
        System.out.printf(" PI is %f.12 %n",Math.PI);
        System.out.printf(" PI is %.99f %n",Math.PI);




    }
}
