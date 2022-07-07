package Lesson7.legs;

public class SonyLeg implements ILeg{

    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println(" Нога Sony прошла 100км ");
    }

    @Override
    public int getPrice() {
        return 10000;
    }
}
