package Lesson7.hands;

public class SonyHands implements IHand {

    private final int price;

    public SonyHands(int price) {
        this.price = price;
    }
    @Override
    public void upHand() {
        System.out.println("Рука Sony подымается на 100 градусов");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
