package Lesson8.Pants;

public class PumaPants implements Pant {


    @Override
    public void putOn() {
        System.out.println("Надеты штаны пума");
    }

    @Override
    public void putOf() {
        System.out.println("Штаны пума сняты");
    }
}
