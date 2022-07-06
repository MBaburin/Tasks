package Lesson2;

public class Task2 {
    public static void main(String[] src) {
        int amb = 1;
        for (int i = 0; i <= 24; i++) {
            if(i % 3 == 0){
                amb*=2;
                System.out.println(amb);
            }
        }
    }
}
