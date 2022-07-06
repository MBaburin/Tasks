package Lesson3;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args){
        int mass[] = new int[101];

        for (int i =1; i <= 101; i++){
            if(i % 2 == 1){
                mass[i] = i;
            }
            System.out.print(mass[i] + " ");
        }

    }
}
