package Lesson8.Sneakers;


public class AdidasSneakers implements Sneakers {


    @Override
    public void putOn() {
        System.out.println("Надеты кросовки адидас");
    }

    @Override
    public void putOf() {
        System.out.println("Кросовки адидас сняты");
    }
}
