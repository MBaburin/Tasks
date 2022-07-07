package Lesson8.Pants;

public class NikePants implements Pant {


    @Override
    public void putOn() {
        System.out.println("Надеты штаны найк");
    }

    @Override
    public void putOf() {
        System.out.println("Штаны найк сняты");
    }
}
