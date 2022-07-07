package Lesson7.hands;

public class SamsungHands implements IHand {

    private final int price;

    public SamsungHands(int price) {
        this.price = price;
    }
    @Override
    public void upHand() {
        System.out.println("Рука Samsung подымается на 80 градусов");
    }

    @Override
    public int getPrice() {
        return 500;
    }
}
