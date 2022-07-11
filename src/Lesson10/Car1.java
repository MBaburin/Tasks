package Lesson10;
    import java.util.Random;

    public class Car1 {
        private String model;
        private int speed;
        private int price;

        public Car1() {
        }

        public Car1(String model, int speed, int price) {
            this.model = model;
            this.speed = speed;
            this.price = price;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
        public void start() throws StartException  {
            Random random=new Random();
            int r= random.nextInt(21);
            if (r%2==0){
                throw new StartException ("Ошибка запуска",model);
            }else{
                System.out.println("Машина "+model+" завелась.");
            }
        }
    }
