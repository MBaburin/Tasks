package Lesson6;

public class Main {
    public static void main(String[] args){
        Passenger mercedes = new Passenger(100,120,2000," mercedes ",4, 2, "sedan", 5,3);
        mercedes.about();
        System.out.println(" ");
        Truck maz = new Truck(1000,60,4000,"maz",4, 1, 1000, 500);
        maz.load();
    }
}
