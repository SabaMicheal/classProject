package acadamy.learnprgramming;


public class Intro {

    public static void main(String[] args){
        Car myCar = new Car("Saba car");
        Car anotherCar = new Car("The Batmobile");

        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();
        myCar.braket();
        myCar.accelerate();

        anotherCar.braket();

    }
}
class Car{


    private int speed = 0;
    private  String name;

    public  Car(String carName){
        name = carName;

    }


    public void accelerate(){
        speed++;
        System.out.printf("s is going %d kilometres per hour.%n",name,speed);
    }
    public void braket(){
        speed--;
        System.out.printf("% is  going %d kilometres per hour.%n" ,name ,speed);
    }
}
