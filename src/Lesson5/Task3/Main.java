package Lesson5.Task3;

public class Main {

    public static void main(String[] args){
        Phone Xiaomi = new Phone("1111111","POCO X3 Pro 8GB/256GB" , 1);
        Phone Huawei = new Phone("1112311","nova Y70 4GB/128GB" , 1);
        Phone Apple = new Phone("1112211","iPhone 13 128GB" , 1);

        Xiaomi.write();
        System.out.println(" ");
        Huawei.write();
        System.out.println(" ");
        Apple.write();
        System.out.println(" ");

    }

}
