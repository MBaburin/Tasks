package Lesson11.Task1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Task1 {
    public static void main(String[] args) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/Lesson11/Task1/car.txt"))){
            car lamborghini=new car("Lamborghini",300,300000);
            oos.writeObject(lamborghini);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/Lesson11/Task1/car.txt"))){
            car lamborghini=(car) ois.readObject();
            System.out.printf("Model: %s\nSpeed: %d km/h\nPrice: %d$",lamborghini.getModel(),lamborghini.getSpeed(),lamborghini.getPrice());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
