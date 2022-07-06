package Lesson2;

public class Task1 {
    public static void main(String[] args) {
        double kmStart = 10;
        for (int i = 1; i < 8; i++) {
            kmStart = kmStart + (kmStart * 0.1);
            System.out.println(kmStart);
        }
    }
}
