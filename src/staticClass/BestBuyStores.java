package staticClass;

public class BestBuyStores {
    public static void main(String[] args){
        BestBuy storeOne = new BestBuy(); //this two are object
        BestBuy storeTwo = new BestBuy();
        BestBuy.printComputer();
        //System.out.println(storeOne.numOfComputers);
        storeOne.numOfComputers--;
        //storeOne.numOfComputers = 20;
        //System.out.println(storeTwo.numOfComputers);
          BestBuy.printComputer();
    }
}
//Note you can reassigning