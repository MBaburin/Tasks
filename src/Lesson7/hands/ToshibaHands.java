package Lesson7.hands;

public class ToshibaHands implements IHand {

    private final int price;

    public ToshibaHands(int price) {
        this.price = price;
    }
    @Override
    public void upHand() {
        System.out.println("Рука Toshiba подымается на 90 градусов");
    }

    @Override
    public int getPrice() {
        return 400;
    }
}
