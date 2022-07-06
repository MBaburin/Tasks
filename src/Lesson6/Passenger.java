package Lesson6;

public class Passenger extends Ground{
    String body;
    int passengers;
    int time;

    Passenger(int a, int b, int c, String d, int e, int f, String j, int h, int i){
        power =a;
        speed =b;
        weight =c;
        mark = d;
        wheels = e;
        consumption = f;
        body = j;
        passengers = h;
        time = i;

    }

    public void about(){
        System.out.println("За время " + time + " ч, " + "автомобиль " + mark + " двигаясь максимальной скоростью " + speed + " км/ч проедет " + (speed*time) + " км/ч" + " и израсходует " + (consumption*(speed*time)) + " литров бензина ");
    }


}
