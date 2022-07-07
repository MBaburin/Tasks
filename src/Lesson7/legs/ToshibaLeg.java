package Lesson7.legs;

public class ToshibaLeg implements ILeg{

    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println(" Нога Toshiba прошла 80км ");
    }

    @Override
    public int getPrice() {
        return 1000
                ;
    }
}
