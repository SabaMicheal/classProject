package Multidementional;

import java.util.Arrays;

public class Multid {
    public static void main(String[]args){

       // int [] [] groups =new int[3] [4];
       // int [] num ={1,2,3,4,5}; // if
        //groups[0] =num;


       // System.out.println(Arrays.deepToString(groups));


       // String [] [] str=new String[7] [5];
       // System.out.println(Arrays.deepToString(str));



       // String [] [] [] str=new String [2] [5] [6];
       // System.out.println(Arrays.deepToString(str));


        int  [] [] numbers ={ {1,2,3,9} , {4,5,},{7,8,9} };
       // System.out.println(Arrays.toString(numbers[0]) + " " + Arrays.toString(numbers[2]);

        System.out.println(numbers[1].length);
        for(int i =0; i< numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) ;
            System.out.println(numbers[i][i]);
        }
        //for each loop it's only read each every element it's noting to do just read
        //to print each all Array

            System.out.println();

        }

    }


