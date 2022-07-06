package Lesson5.Task3;

public class Phone {

    String number;
    String model;
    int weight;

    Phone(String a, String b, int c){
        number = a;
        model = b;
        weight = c;
    }

    public void write(){
        System.out.print("Телефон модели "+ model + " весом " + weight + " кг " + " с номером " +  number);
    }

}
