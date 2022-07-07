package Lesson8.Jackets;

public class NikeJacket implements Jacket{


    @Override
    public void putOn() {
        System.out.println("Надета куртка найк");
    }

    @Override
    public void putOf() {
        System.out.println("Куртка найк снята");
    }
}
