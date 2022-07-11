package Lesson10;

public class Main {
    public static void main(String[] args){
        Car1 bmv = new Car1("BMV", 100, 10000);
        Car1 mercedes = new Car1("Mercedes", 120, 10200);
        Car1[] cars = new Car1[]{bmv, mercedes};
        for(int i = 0;i < cars.length; i++){
            try {
                cars[i].start();
            } catch (StartException e){

            }
        }
    }
}
