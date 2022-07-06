package Lesson5.Task2;

public class Car {

    String name;
    int speed;

     Car(String n, int c){
         name = n;
         speed = c;
     }
     public void write(){
         System.out.print("Машина " + name + " едет со скоростью " + speed+ " км/ч");
     }

}
