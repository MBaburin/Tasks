package Lesson8.Sneakers;


public class PumaSneakers implements Sneakers {


    @Override
    public void putOn() {
        System.out.println("Надеты кросовки пума");
    }

    @Override
    public void putOf() {
        System.out.println("Кросовки пума сняты");
    }
}
