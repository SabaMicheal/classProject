package Multidementional;

public class ForLoop {
    public static void main(String[] args) {

        int  [] [] numbers ={ {1,2,3,9} , {4,5,},{7,8,9} };
        for(int [] inner: numbers) {
            for(int element  : inner) {
                System.out.print(element );
            }
            System.out.println();
        }
    }
}


//Note;- you can,t Sorted two Multidemantional arrays
// demantional mated we use to more orgaanize and make out code in one cotener
//and easy to compayl
