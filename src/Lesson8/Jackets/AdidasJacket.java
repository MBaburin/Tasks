package Lesson8.Jackets;

public class AdidasJacket implements Jacket{


    @Override
    public void putOn() {
        System.out.println("Надета куртка адидас");
    }

    @Override
    public void putOf() {
        System.out.println("Куртка адидас снята");
    }
}
