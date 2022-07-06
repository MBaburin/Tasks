package Lesson3;

import java.util.Random;

public class Task4 {
    public static void main(String[] args){
        Random r = new Random();
        int mass[] = new int[20];
        for (int i = 0; i <= mass.length; i++){
            mass[i] = r.nextInt(20);
            if(i % 2 == 1){
                mass[i] = 0;
            }
            System.out.print(mass[i] + " ");

        }
    }

}
