package Lesson2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] ars){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double c =0;
        System.out.println("Введите колличество дюймов");
        for(int i=1; i<=a; i++){
            c = i * 2.54;
            System.out.println(c);
        }
    }
}
