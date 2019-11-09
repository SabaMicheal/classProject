package varibles;

 class PreAndPostIncrement{

    public static void main(String []arg){

        int a= 5;
        int b= 2;
        int c;
        int d;
        c = ++b; // Line A
        d = a++; // Line B
        c++;  // Line c

        System.out.print("a = " + a + " b = " + b + "c ="  + c + "d =" + d);
    }



}
