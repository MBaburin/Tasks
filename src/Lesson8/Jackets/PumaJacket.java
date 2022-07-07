package Lesson8.Jackets;

public class PumaJacket implements Jacket{


    @Override
    public void putOn() {
        System.out.println("Надета куртка пума");
    }

    @Override
    public void putOf() {
        System.out.println("Куртка пума снята");
    }
}
