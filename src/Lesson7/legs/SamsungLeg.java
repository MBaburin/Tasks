package Lesson7.legs;

public class SamsungLeg implements ILeg{

    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println(" Нога Samsung прошла 60км ");
    }

    @Override
    public int getPrice() {
        return 500;
    }
}
