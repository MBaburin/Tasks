package Lesson3;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random r = new Random();
        int mass[] = new int[15];
        int counter = 0;
        for (int i = 0; i <= mass.length; i++){
            mass[i] = r.nextInt(99);
            System.out.print(mass[i] + " ");
            if(mass[i] % 2 == 0){
                counter++;
            }
            System.out.println(counter + " Чётных");
        }


    }
}
