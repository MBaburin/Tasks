package Lesson8.Pants;



public class AdidasPants implements Pant {


    @Override
    public void putOn() {
        System.out.println("Надеты штаны адидас");
    }

    @Override
    public void putOf() {
        System.out.println("Штаны адидас сняты");
    }
}
