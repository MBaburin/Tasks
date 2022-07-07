package Lesson8.Sneakers;


public class NikeSneakers implements Sneakers {


    @Override
    public void putOn() {
        System.out.println("Надеты кросовки найк");
    }

    @Override
    public void putOf() {
        System.out.println("Кросовки найк сняты");
    }
}
