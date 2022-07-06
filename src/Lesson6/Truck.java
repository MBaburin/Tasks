package Lesson6;

public class Truck extends Ground{

    int capacity;
    int cargo;

    Truck(int a, int b, int c, String d, int e, int f, int j, int h ){
        power =a;
        speed =b;
        weight =c;
        mark = d;
        wheels = e;
        consumption = f;
        capacity =j;
        cargo = h;
    }

    public void load(){
        if(capacity > cargo){
            System.out.println("Грузовик марки " + mark + " грузоподъёмностью " + capacity + " кг поднял груз весом " + cargo + " кг." );
        } else {
            System.out.println("Грузовик марки " + mark + " грузоподъёмностью " + capacity + " кг не поднял груз весом " + cargo + " кг." );
        }
    }

}
