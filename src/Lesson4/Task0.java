package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Task0 {
    public static void main(String [] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        int a;
        a = s.nextInt();
        int sum = 0;

        int[][] mass = new int[a][a];

        for (int i = 0; i<a; i++){
            for(int j=0; j<a; j++){
                mass[i][j] = r.nextInt(50);
            }
        }

        for (int i = 0; i<a; i++){
            for(int j=0; j<a; j++){
               System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }

        for (int i =0; i<mass.length; i++){
            int j = i;
            if(mass[i][j] % 2 == 0){
                sum += mass[i][j];
            }
        }
        System.out.println(" ");
        System.out.println("Сумма чётных чисел главной диоганали " + sum);
    }
}
